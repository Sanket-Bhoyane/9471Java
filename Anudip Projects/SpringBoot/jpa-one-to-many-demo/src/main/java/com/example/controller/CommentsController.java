package com.example.controller;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Comments;
import com.example.repository.PostRepository;
import com.example.repository.CommentsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class CommentsController {

    @Autowired
    private CommentsRepository commentsRepository;

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/posts/{postId}/comments")
    public Page<Comments> getAllCommentsByPostId(@PathVariable (value = "postId") Long postId,
                                                Pageable pageable) {
        return commentsRepository.findByPostId(postId, pageable);
    }

    @PostMapping("/posts/{postId}/comments")
    public Comments createComment(@PathVariable (value = "postId") Long postId,
                                 @Valid @RequestBody Comments comments) {
        return postRepository.findById(postId).map(post -> {
            comments.setPost(post);
            return commentsRepository.save(comments);
        }).orElseThrow();
    }

    @PutMapping("/posts/{postId}/comments/{commentsId}")
    public Comments updateComment(@PathVariable (value = "postId") Long postId,
                                 @PathVariable (value = "commentsId") Long commentsId,
                                 @Valid @RequestBody Comments commentsRequest) {
        if(!postRepository.existsById(postId)) {
            throw new ResourceNotFoundException("PostId " + postId + " not found");
        }

        return commentsRepository.findById(commentsId).map(comments -> {
            comments.setText(commentsRequest.getText());
            return commentsRepository.save(comments);
        }).orElseThrow();
    }

    @DeleteMapping("/posts/{postId}/comments/{commentsId}")
    public ResponseEntity<?> deleteComments(@PathVariable (value = "postId") Long postId,
                              @PathVariable (value = "commentsId") Long commentsId) {
        return commentsRepository.findByIdAndPostId(commentsId, postId).map(comments -> {
            commentsRepository.delete(comments);
            return ResponseEntity.ok().build();
        }).orElseThrow();
    }
}
