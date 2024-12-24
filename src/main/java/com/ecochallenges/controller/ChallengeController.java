package com.ecochallenges.controller;

import com.ecochallenges.model.dto.ChallengeDTO;
import com.ecochallenges.model.entity.Challenge;
import com.ecochallenges.service.ChallengeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenges")
@AllArgsConstructor
public class ChallengeController {

    private final ChallengeService challengeService;

    @GetMapping
    public List<Challenge> getAllChallenges() {
        return challengeService.findAll();
    }

    @GetMapping("/{id}")
    public Challenge getChallenge(@PathVariable Long id) {
        return challengeService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Challenge saveChallenge(@RequestBody ChallengeDTO challengeDTO) {
        return challengeService.save(challengeDTO);
    }

    @PutMapping("/{id}")
    public Challenge updateChallenge(@PathVariable Long id, @RequestBody ChallengeDTO challengeDTO) {
        return challengeService.update(id, challengeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteChallenge(@PathVariable Long id) {
        challengeService.delete(id);
    }
}
