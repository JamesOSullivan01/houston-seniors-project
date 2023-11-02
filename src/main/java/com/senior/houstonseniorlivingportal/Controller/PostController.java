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
}
