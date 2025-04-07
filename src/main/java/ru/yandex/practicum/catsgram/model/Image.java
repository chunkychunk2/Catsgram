package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Image {
    @NonNull
    private Long id;
    @NonNull
    private long postId;
    @NonNull
    private String originalFileName;
    @NonNull
    private String filePath;

}
