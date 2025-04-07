package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
public class User {

    private Long id;

    private String username;

    private String email;

    private String password;

    private Instant registrationDate;

}
