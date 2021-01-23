package com.tedeev.webblog.repository;

import com.tedeev.webblog.models.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * todo Document type PostRepository
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
