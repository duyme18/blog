package com.hdd.repository;

import com.hdd.model.Catergory;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CatergoryRepository extends PagingAndSortingRepository<Catergory,Long> {
}
