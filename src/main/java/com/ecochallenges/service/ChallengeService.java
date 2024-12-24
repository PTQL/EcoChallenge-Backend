package com.ecochallenges.service;

import com.ecochallenges.exception.ResourceNotFoundException;
import com.ecochallenges.model.dto.ChallengeDTO;
import com.ecochallenges.model.entity.Challenge;
import com.ecochallenges.repository.ChallengeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ChallengeService {

    private final ChallengeRepository challengeRepository;

    public List<Challenge> findAll() {
        return challengeRepository.findAll();
    }

    public Challenge findById(Long id) {
        return challengeRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public Challenge save(ChallengeDTO challengeDTO) {
        Challenge challenge = new Challenge();
        challenge.setTitle(challengeDTO.getTitle());
        challenge.setDescription(challengeDTO.getDescription());
        challenge.setPoints(challengeDTO.getPoints());
        challenge.setType(challengeDTO.getType());
        challenge.setStatus(challengeDTO.getStatus());
        challenge.setRequiredEvidence(challengeDTO.getRequiredEvidence());
        challenge.setCreatedAt(LocalDateTime.now());
        return challengeRepository.save(challenge);
    }

    public Challenge update(Long id, ChallengeDTO challengeDTO) {
        Challenge challengeToUpdate = findById(id);
        challengeToUpdate.setTitle(challengeDTO.getTitle());
        challengeToUpdate.setDescription(challengeDTO.getDescription());
        challengeToUpdate.setPoints(challengeDTO.getPoints());
        challengeToUpdate.setType(challengeDTO.getType());
        challengeToUpdate.setStatus(challengeDTO.getStatus());
        challengeToUpdate.setRequiredEvidence(challengeDTO.getRequiredEvidence());
        return challengeRepository.save(challengeToUpdate);
    }

    public void delete(Long id) {
        Challenge challengeToDelete = findById(id);
        challengeRepository.deleteById(challengeToDelete.getId());
    }


}
