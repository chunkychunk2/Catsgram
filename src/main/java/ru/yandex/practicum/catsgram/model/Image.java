package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Data
@Builder
public class Image {

    private Long id;

    private long postId;

    private String originalFileName;

    private String filePath;

}
