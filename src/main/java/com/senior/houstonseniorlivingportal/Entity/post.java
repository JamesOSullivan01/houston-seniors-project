package com.senior.houstonseniorlivingportal.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "post")

public class post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id")
    private Long postId;
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "title")
    private String title;
    @Column(name = "meta_title")
    private String metaTitle;
    @Column(name = "slug")
    private String slug;
    @Column(name = "summary")
    private String summary;
    @Column(name = "created_at")
    private Timestamp createdAt;
    @Column(name = "updated_at")
    private Timestamp updatedAt;
    @Column(name = "content")
    private String content;
}
