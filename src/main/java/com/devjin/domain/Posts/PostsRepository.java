package com.devjin.domain.Posts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts,Long> {
    @Query(value = "SELECT * FROM POSTS p ORDER BY p.no DESC" ,nativeQuery = true)
    List<Posts> postsFindAll();
}
