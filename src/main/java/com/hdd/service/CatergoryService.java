package com.hdd.service;

import com.hdd.model.Catergory;

public interface CatergoryService {
    Iterable<Catergory> findAll();

    Catergory findById(Long id);

    void save(Catergory catergory);

    void remove(Long id);
}
