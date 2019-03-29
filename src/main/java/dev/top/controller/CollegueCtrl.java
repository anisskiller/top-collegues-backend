package dev.top.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.top.entities.Collegue;
import dev.top.repos.CollegueRepo;
import dev.top.entities.NewCollegue;
import dev.top.service.CollegueService;
import dev.top.service.NewCollegueService;
import dev.top.entities.Votes;
import dev.top.entities.Avis;

@CrossOrigin
@RestController()
@RequestMapping("/collegues")
public class CollegueCtrl {

    @Autowired
    private CollegueRepo collectionRepo;

    @Autowired
    private CollegueService collectionService;

    @Autowired
    private CollegueService collegueService;

    @Autowired
    private NewCollegueService newCollegueService;

    @GetMapping
    public List<Collegue> findAll() {
        // return this.collectionRepo.findAll();
        return this.collectionService.findAll();
    }

//    @GetMapping("/{pseudo}")
//     public Collegue findByPseudo(String pseudo) {
//         return this.collectionRepo.findByPseudo(pseudo).orElseThrow(() -> new RuntimeException("lol"));
//     } 

    @PatchMapping("/{pseudo}")
    public Collegue voter(@PathVariable String pseudo, @RequestBody Votes vote) {
        // return this.collectionRepo.findByPseudo(pseudo).orElseThrow( () -> new RuntimeException("plop"));
        return this.collectionService.voter(pseudo, vote.getAvis());
    } 
}