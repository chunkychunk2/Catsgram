package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
@EqualsAndHashCode(of = { "email" })
public class User {

    private Long id;

    private String username;

    private String email;

    private String password;

    private Instant registrationDate;

}
