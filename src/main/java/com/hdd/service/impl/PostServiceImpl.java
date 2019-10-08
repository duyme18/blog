package com.hdd.service.impl;


import com.hdd.model.Catergory;
import com.hdd.model.Post;
import com.hdd.repository.PostRepository;
import com.hdd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Page<Post> findAll(Pageable pageable) {
        return postRepository.findAll(pageable);
    }

    @Override
    public Post findById(Long id) {
        return postRepository.findOne(id);
    }

    @Override
    public void save(Post post) {
        postRepository.save(post);
    }

    @Override
    public void remove(Long id) {
        postRepository.delete(id);
    }

    @Override
    public Iterable<Post> findAllByCatergory(Catergory catergory) {
        return postRepository.findAllByCatergory(catergory);
    }

    @Override
    public Page<Post> findAllByTitlePostContaining(String titlepost, Pageable pageable) {
        return postRepository.findAllByTitlePostContaining(titlepost, pageable);
    }
}