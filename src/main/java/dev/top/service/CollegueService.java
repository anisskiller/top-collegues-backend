package dev.top.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dev.top.entities.Avis;
import dev.top.entities.Collegue;
import dev.top.exception.TopCollegueException;
import dev.top.repos.CollegueRepo;

@Service 
public class CollegueService {

    private CollegueRepo colRepo; 

    public CollegueService(CollegueRepo collegueRepo) {
        this.colRepo = collegueRepo; 
    }

    public List<Collegue> findAll() {
        return colRepo.findAll();
    }

    @Transactional
    public Collegue voter(String pseudo, Avis avis) {

        if(pseudo == null || avis == null) {
            throw new TopCollegueException("Au moins un");
        }

        Collegue collegueTrouve = this.colRepo.findByPseudo(pseudo).orElseThrow(() -> new TopCollegueException("pseudo inexistant"));

        Integer score = collegueTrouve.getScore(); 

        if(avis.equals(avis.AIMER)) {
                collegueTrouve.setScore(score + 100);
        } else if(avis.equals(avis.DETESTER)) {
                collegueTrouve.setScore(score - 100);
        }

        return collegueTrouve;
    }

    public  void save(Collegue newCollegues) {
        this.colRepo.save(newCollegues);
	}
}