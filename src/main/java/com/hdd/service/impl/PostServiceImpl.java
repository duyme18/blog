package com.hdd.service.impl;


import com.hdd.model.Catergory;
import com.hdd.model.Post;
import com.hdd.repository.PostRepository;
import com.hdd.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;

public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public Iterable<Post> findAll() {
        return postRepository.findAll();
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
}