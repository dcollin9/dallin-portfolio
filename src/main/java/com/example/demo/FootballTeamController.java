package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class FootballTeamController {

    @GetMapping(path = "/football-teams/{id}")
    public String getFootballTeam(
            @PathVariable String id
    ) {
        return id;
    }

    @GetMapping(value = "/football-teams")
    public List<String> getFootballTeams(
    ) {
        return new ArrayList<>();
    }

    @PostMapping("/football-team")
    public void createFootballTeam(
            @RequestBody(required = true) Object object
    ) {

    }

    @PutMapping("/football-team/{id}")
    public void updateFootballTeam(
            @RequestBody(required = true) Object object,
            @PathVariable String id
    ) {

    }

    @DeleteMapping("/football-team/{id}")
    public void deleteFootballTeam(
            @PathVariable String id
    ) {

    }
}
