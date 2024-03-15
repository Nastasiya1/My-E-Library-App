package ru.mypackage.elibraryapp.repositories;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import ru.mypackage.elibraryapp.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    @Modifying
    @Query("INSERT INTO user (name, email) VALUES(:name, :email)")
    void addUser(String name, String email);

    @Modifying
    @Query("UPDATE user SET name = :newName WHERE id = :id")
    void changeUserName(int id, String newName);

    @Modifying
    @Query("UPDATE user SET email = :newEmail WHERE id = :id")
    void changeUserEmail(int id, String newEmail);
}