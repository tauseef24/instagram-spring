package com.springexample.instagram.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "posts")
public class Posts {
    @Id
    private String id;

    private String title;
    private String description;
    private String imageUrl;
    private Integer likes;
}
