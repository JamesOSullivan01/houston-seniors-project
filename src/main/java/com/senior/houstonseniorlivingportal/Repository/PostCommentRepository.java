package com.senior.houstonseniorlivingportal.Repository;

import com.senior.houstonseniorlivingportal.Entity.PostComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostCommentRepository extends JpaRepository<PostComment, Long> {
}
