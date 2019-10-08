package com.hdd.repository;

import com.hdd.model.Catergory;
import com.hdd.model.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;



public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
    Iterable<Post> findAllByCatergory(Catergory catergory);

}
