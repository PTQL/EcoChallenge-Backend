package com.ecochallenges.service;

import com.ecochallenges.exception.BadRequestException;
import com.ecochallenges.exception.ResourceNotFoundException;
import com.ecochallenges.model.dto.UserFormDTO;
import com.ecochallenges.model.entity.User;
import com.ecochallenges.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class UserAdminService {

    private final UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        return userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
    }

    public User create(UserFormDTO userFormDTO) {

        boolean existEmail = userRepository.existsByEmail(userFormDTO.getEmail());

        if (existEmail) {
            throw new BadRequestException("El email ya existe");
        }

        User user = new User();
        user.setFirstName(userFormDTO.getFirstName());
        user.setLastName(userFormDTO.getLastName());
        user.setEmail(userFormDTO.getEmail());
        user.setPassword(userFormDTO.getPassword());
        user.setRole(userFormDTO.getRole());
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }

    public User update(Integer id, UserFormDTO userFormDTO) {
        User user = userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        user.setFirstName(userFormDTO.getFirstName());
        user.setLastName(userFormDTO.getLastName());
        user.setEmail(userFormDTO.getEmail());
        user.setPassword(userFormDTO.getPassword());
        user.setRole(userFormDTO.getRole());
        user.setUpdatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }


    public void delete(Integer id) {
        User user = userRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        userRepository.deleteById(user.getId());

    }



}
