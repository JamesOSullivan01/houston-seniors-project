package com.senior.houstonseniorlivingportal.service;

import com.senior.houstonseniorlivingportal.Entity.Post;
import com.senior.houstonseniorlivingportal.Repository.PostRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;
    @Override
    public Post newPost(Post post) {
        System.out.println("new post method called:");
        System.out.println(post);
        return postRepository.save(post);
    }

    @Override
    @Transactional
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);
    }

    @Override
    public Post updatePost(Long postId, Post post) {
        return postRepository.save(post);
    }

    @Override
    public Post showPostbyId(Long postId) {
        return postRepository.getReferenceById(postId);
    }

    @Override
    public Post getPostById(Long postId) {
        return postRepository.getById(postId);
    }

}
