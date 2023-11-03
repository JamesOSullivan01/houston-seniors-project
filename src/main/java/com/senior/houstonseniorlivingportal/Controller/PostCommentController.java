package com.senior.houstonseniorlivingportal.Controller;

import com.senior.houstonseniorlivingportal.Entity.Post;
import com.senior.houstonseniorlivingportal.Entity.PostComment;
import com.senior.houstonseniorlivingportal.Repository.PostRepository;
import com.senior.houstonseniorlivingportal.service.PostCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Timestamp;

import static java.lang.System.*;

@RestController
public class PostCommentController {

    @Autowired
    private PostCommentService postCommentService;
    @Autowired
    private PostRepository postRepository;

    @PostMapping("/add-a-comment/{post_id}")
    public PostComment addAPostComment(@PathVariable Long post_id, @RequestBody PostComment postComment) {
        // Retrieve the existing Post from the database based on post_id
        Post post = postRepository.findById(post_id).orElse(null);

        if (post == null) {
            out.println("NULL!!!!!");
        } else {
            // Associate the retrieved Post with the PostComment
            postComment.setPost(post);

            // The rest of your code to save the comment
            return postCommentService.addAPostComment(postComment);
        }
        return postCommentService.addAPostComment(postComment);

    }
}


//    @PostMapping("/add-a-comment/{post_id}")
//    public PostComment addAPostComment(@PathVariable Long post_id, @RequestBody PostComment postComment){
//
//        Post post = postRepository.findById(post_id).orElse(null);
////        post.setPostId(post_id);
//        postComment.setPost(post);
//        out.println(postComment);
//        return postCommentService.addAPostComment(postComment);
//
//}

