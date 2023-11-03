package com.senior.houstonseniorlivingportal.service;

import com.senior.houstonseniorlivingportal.Entity.Post;

public interface PostService {
    Post newPost(Post post);

    void deletePost(Long postId);

    Post updatePost(Long postId, Post post);


    Post showPostbyId(Long postId);

    Post getPostById(Long postId);
}
