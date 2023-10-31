package com.senior.houstonseniorlivingportal.Entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tag")
public class tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tag_id")
    private Long tagId;
    @Column(name = "title")
    private String title;
    @Column(name = "metaTitle")
    private String metaTitle;
    @Column(name = "slug")
    private String slug;
    @Column(name = "text")
    private String text;
}
