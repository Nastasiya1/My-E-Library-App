package ru.mypackage.elibraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ELibraryAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(ELibraryAppApplication.class, args);
        //todo подписка клиента для пользования сервисом
        //todo расширенный функционал для admin (просмотр всех пользователей, удаление, изменение и добавление книг)
        //todo авторизация
    }
}