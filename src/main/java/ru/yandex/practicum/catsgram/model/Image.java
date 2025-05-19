package ru.yandex.practicum.catsgram.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import java.time.Instant;
@Data
@Builder
public class Image {

    private Long id;

    private Long postId;

    private String originalFileName;

    private String filePath;

}
