package com.example.repository;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Post;
@Repository
public interface PostRepository extends JpaRepository<Post,Long>{

	Page<Post> findAll(Pageable pageable);

}
