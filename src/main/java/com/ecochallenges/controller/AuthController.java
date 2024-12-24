package com.ecochallenges.controller;

import com.ecochallenges.model.dto.AuthRequest;
import com.ecochallenges.model.dto.AuthResponse;
import com.ecochallenges.model.dto.SignupFormDTO;
import com.ecochallenges.model.dto.UserProfileDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/*
@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {
    private FirebaseAuthService firebaseAuthService;

    @PostMapping("/login")
    public AuthResponse login(@RequestBody @Validated AuthRequest request) {
        return firebaseAuthService.login(request);
    }

    @PostMapping("/signup")
    @ResponseStatus(HttpStatus.CREATED)
    public UserProfileDTO signup(@RequestBody @Validated SignupFormDTO request) {
        return firebaseAuthService.signup(request);
    }
}

 */