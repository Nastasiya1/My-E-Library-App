package ru.mypackage.elibraryapp.services;

import org.springframework.stereotype.Service;
import ru.mypackage.elibraryapp.dto.UserInfoChangeRequest;
import ru.mypackage.elibraryapp.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(String name, String email) {
        userRepository.addUser(name, email);
    }

    @Override
    public void deleteUser(int ID) {
        userRepository.deleteById(ID);
    }

    @Override
    public void changeUser(int id, UserInfoChangeRequest userInfoChangeRequest) {
        if (userInfoChangeRequest.getEmail() != null) {
            userRepository.changeUserEmail(id, userInfoChangeRequest.getEmail());
        }
        if (userInfoChangeRequest.getName() != null) {
            userRepository.changeUserName(id, userInfoChangeRequest.getName());
        }
    }
}