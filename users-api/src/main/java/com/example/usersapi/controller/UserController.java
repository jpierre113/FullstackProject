package com.example.usersapi.controller;

import com.example.usersapi.exception.UserNotFoundException;
import com.example.usersapi.model.User;
import com.example.usersapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @PostMapping
    public User createUser(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable(value = "id") Long userId) {
        return userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User", "id", userId));
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable(value = "id") Long UserId,
                           @Valid @RequestBody User UserDetails) {

        userRepository.findById(UserId);

        UserDetails.setId(UserId);
        User updateUser = userRepository.save(UserDetails);
        return updateUser;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long UserId) {
        User user = userRepository.findById(UserId).orElseThrow(() -> new UserNotFoundException("User", "id", UserId));

        userRepository.delete(user);
        return ResponseEntity.ok().build();
    }
}
