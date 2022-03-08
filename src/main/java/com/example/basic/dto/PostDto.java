package com.example.basic.dto;

import lombok.Data;

@Data
public class PostDto {
    private Long id;
    private String title;
    private String content;
    private String writer;
    private String password;
    private Long boardId;
    private Long userId;

    public PostDto() {
    }



    public PostDto passwordMasked() {
        return new PostDto(
                this.id,
                this.title,
                this.content,
                this.writer,
                "*****",
                this.boardId,
                this.userId
        );
    }

}
