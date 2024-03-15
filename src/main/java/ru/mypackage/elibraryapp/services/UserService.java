package ru.mypackage.elibraryapp.services;

import ru.mypackage.elibraryapp.dto.UserInfoChangeRequest;

public interface UserService {
    void addUser(String name, String email);

    void deleteUser(int id);

    void changeUser(int id, UserInfoChangeRequest userInfoChangeRequest);
}