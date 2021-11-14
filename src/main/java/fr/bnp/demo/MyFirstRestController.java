package fr.bnp.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyFirstRestController {

    @Autowired
    PlayerRepository playerRepository;


    @GetMapping
    public String test() {
        return "hello world";
    }

    @GetMapping("/test-path")
    public String testPath() {
        return "hello world with path";
    }


    @PostMapping("/post-test")
    public String testPost(@RequestParam("temperature") Integer temperature,
                           @RequestHeader("credentials") String test,
                           @RequestBody Player player) {
        return "la temperature est de " + player.getNom();
    }

    @GetMapping("players")
    public List<Player> getAllPlyers() {
        return playerRepository.findAll();
    }
}
