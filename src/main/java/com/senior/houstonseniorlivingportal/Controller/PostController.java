package com.senior.houstonseniorlivingportal.Controller;

import com.senior.houstonseniorlivingportal.Entity.Post;
import com.senior.houstonseniorlivingportal.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping("/new-post")
    public Post createNewPost(@RequestBody Post post){
        System.out.println("HI");
        System.out.println(post);
        return postService.newPost(post);
    }

    @DeleteMapping("/delete-post/{post_id}")
    public void deletePost(@PathVariable Long post_id){
        postService.deletePost(post_id);
    }
    @PostMapping("/update-post/{post_id}")
    public Post updateBlogPost(@PathVariable Long post_id, @RequestBody Post updatedPost) {
        return postService.updatePost(post_id, updatedPost);
    }

    @GetMapping("/blog-post/{post_id}")
    public Post displayPostById(@PathVariable Long post_id){
        Post post = postService.getPostById(post_id);
        return post;
    }



}
