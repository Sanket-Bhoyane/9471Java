package com.example.repository;

import java.util.Optional;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Comments;



public interface CommentsRepository extends JpaRepository<Comments,Long>{
Page<Comments> findByPostId(Long postId, org.springframework.data.domain.Pageable pageable);
Optional<Comments> findByIdAndPostId(Long id, Long postId);
}
