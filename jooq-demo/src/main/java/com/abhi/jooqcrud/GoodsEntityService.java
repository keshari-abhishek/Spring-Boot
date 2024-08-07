package com.abhi.jooqcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsEntityService {
	
    @Autowired
    private GoodsRepository repository;

    public List<Goods> getAllEntities() {
        return repository.findAll();
    }

}
