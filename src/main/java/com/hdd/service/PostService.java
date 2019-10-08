package com.hdd.service;

import com.hdd.model.Catergory;
import com.hdd.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PostService {
    Iterable<Post> findAll();

    Post findById(Long id);

    void save(Post post);

    void remove(Long id);

    Iterable<Post> findAllByCatergory(Catergory catergory);



}
