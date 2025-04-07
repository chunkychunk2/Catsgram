package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.time.Instant;

@Data
@Builder
public class Post {

    private Long id;

    private long authorId;

    private String description = "someDescription";

    private Instant postDate;
}
