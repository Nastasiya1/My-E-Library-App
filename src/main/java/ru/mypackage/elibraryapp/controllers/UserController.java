package ru.mypackage.elibraryapp.controllers;

import org.springframework.web.bind.annotation.*;
import ru.mypackage.elibraryapp.dto.UserInfoChangeRequest;
import ru.mypackage.elibraryapp.model.User;
import ru.mypackage.elibraryapp.services.UserServiceImpl;

@RestController
public class UserController {
    private final UserServiceImpl userServiceImpl;

    public UserController(UserServiceImpl userServiceImpl) {

        this.userServiceImpl = userServiceImpl;
    }

    @PostMapping("/registration")
    public void registerUser(
            @RequestBody User user
    ) {
        userServiceImpl.addUser(user.getName(), user.getEmail());
    }

    @DeleteMapping("/user/{id:\\d+}")
    public void deleteUser(
            @PathVariable("id") int id
    ) {
        userServiceImpl.deleteUser(id);
    }

    @PutMapping("/user/{id:\\d+}")
    public void changeUser(
            @PathVariable("id") int id,
            @RequestBody UserInfoChangeRequest userInfoChangeRequest
    ) {
        userServiceImpl.changeUser(id, userInfoChangeRequest);
    }
}