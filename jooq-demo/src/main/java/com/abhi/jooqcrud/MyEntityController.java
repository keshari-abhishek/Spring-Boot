package com.abhi.jooqcrud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/entities")	
public class MyEntityController {

    @Autowired
    private GoodsEntityService goodsEntityService;

    @GetMapping
    public List<Goods> getAllEntities() {
        return goodsEntityService.getAllEntities();
    }

    // Add more controller methods as needed
}
