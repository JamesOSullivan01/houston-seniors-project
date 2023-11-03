package com.senior.houstonseniorlivingportal.service;

import com.senior.houstonseniorlivingportal.Entity.PostComment;
import com.senior.houstonseniorlivingportal.Repository.PostCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostCommentImpl implements PostCommentService{
    @Autowired
    private PostCommentRepository postCommentRepository;

    @Override
    public PostComment addAPostComment(PostComment postComment) {
        return postCommentRepository.save(postComment);
    }
}
