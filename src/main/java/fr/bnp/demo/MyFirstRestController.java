package fr.bnp.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyFirstRestController {

    @Autowired
    PlayerRepository playerRepository;


    @Autowired
    Temperature temperature;

    @Autowired
    TestService testService;


    @GetMapping
    public String test() {
        return temperature.getTemperature()+ "";
    }

    @GetMapping("/test-path")
    public String testPath() {
        return "hello world with path";
    }


    @PostMapping("/create-player")
    public String testPost(@RequestBody Player player) {
        playerRepository.save(player);
        return "création effectuée avec succés";
    }

    @GetMapping("players")
    public List<Player> getAllPlyers() {
        return playerRepository.findAll();
    }


    @GetMapping("for-test")
    public Player test2(){
        return testService.renderResult();
    }
}
