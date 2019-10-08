package com.hdd.service.impl;

import com.hdd.model.Catergory;
import com.hdd.repository.CatergoryRepository;
import com.hdd.service.CatergoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CatergoryServiceImpl implements CatergoryService {

    @Autowired
    private CatergoryRepository catergoryRepository;

    @Override
    public Iterable<Catergory> findAll() {
        return catergoryRepository.findAll();
    }

    @Override
    public Catergory findById(Long id) {
        return catergoryRepository.findOne(id);
    }

    @Override
    public void save(Catergory catergory) {
        catergoryRepository.save(catergory);
    }

    @Override
    public void remove(Long id) {
        catergoryRepository.delete(id);
    }
}