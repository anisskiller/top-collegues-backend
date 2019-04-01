package dev.top;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import dev.top.entities.Version;
import dev.top.repos.VersionRepo;
import dev.top.repos.CollegueRepo;
import dev.top.repos.VersionRepo;
import dev.top.entities.Collegue;

@Component
public class StartupDataInit {

    @Autowired
    VersionRepo versionRepo;

    @Autowired
    CollegueRepo collegueRepo;

    @EventListener(ContextRefreshedEvent.class)
    public void init() {

        this.versionRepo.save(new Version("v1"));
        this.versionRepo.save(new Version("v2"));
        this.versionRepo.save(new Version("v3"));
        this.versionRepo.save(new Version("v4"));

        // this.collegueRepo.save(new Collegue(1, 5000, "palmtree","https://upload.wikimedia.org/wikipedia/commons/thumb/9/99/Emblem_of_Saudi_Arabia.svg/250px-Emblem_of_Saudi_Arabia.svg.png", 100));

    }
}
