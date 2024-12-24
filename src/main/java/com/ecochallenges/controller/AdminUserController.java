package com.ecochallenges.controller;
import com.ecochallenges.model.dto.UserFormDTO;
import com.ecochallenges.model.entity.User;
import com.ecochallenges.service.UserAdminService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api/admin/users")
@AllArgsConstructor
public class AdminUserController {

    private final UserAdminService userAdminService;

    @GetMapping
    public List<User> getAllUsers() {
        return userAdminService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userAdminService.getUserById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping()
    public User create(@Valid @RequestBody UserFormDTO userFormDTO) {
        return userAdminService.create(userFormDTO);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Integer id, @Validated @RequestBody UserFormDTO userFormDTO) {
        return userAdminService.update(id, userFormDTO);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        userAdminService.delete(id);
    }
}
