package com.ecochallenges.service;

import com.ecochallenges.model.entity.Achievement;
import com.ecochallenges.repository.AchievementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AchievementService {

    private final AchievementRepository achievementRepository;

    public List<Achievement> getAllAchievements() {
        return achievementRepository.findAll();
    }

    
}
