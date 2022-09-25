package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FootballTeamController {

    @GetMapping("/football-team")
    public void getFootballTeam(
            @RequestParam(value = "id") String id
    ) {

    }

//    @GetMapping("/football-team")
//    public void getFootballTeams(
//            @RequestParam(value = "state") String state
//    ) {
//
//    }

//    @PostMapping("/football-team")
//    public void createFootballTeam(
//            @RequestBody(required = true) Object object
//    ) {
//
//    }
//
//    @PutMapping("/football-team")
//    public void updateFootballTeam(
//            @RequestBody(required = true) Object object
//    ) {
//
//    }
//
//    @DeleteMapping("/football-team")
//    public void deleteFootballTeam(
//            @RequestParam(value = "id") String id
//    ) {
//
//    }
}
