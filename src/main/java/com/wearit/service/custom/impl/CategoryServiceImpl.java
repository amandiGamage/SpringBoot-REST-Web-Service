/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wearit.service.custom.impl;

import com.wearit.dao.custom.CategoryDAO;
import com.wearit.model.Category;
import com.wearit.service.custom.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class CategoryServiceImpl implements CategoryService{
    
    @Autowired
    private CategoryDAO categoryDAOImpl;

    @Override
    public boolean add(Category t) throws Exception {
        return categoryDAOImpl.add(t);
    }

    @Override
    public boolean update(Category t) throws Exception {
        return categoryDAOImpl.update(t);
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return categoryDAOImpl.delete(id);
    }

    @Override
    public Category search(Integer id) throws Exception {
        return categoryDAOImpl.search(id);
    }

    @Override
    public List<Category> getAll() throws Exception {
        return categoryDAOImpl.getAll();
    }

    @Override
    public Category getCategoryByName(String name) throws Exception {
        return categoryDAOImpl.getCategoryByName(name);
    }
    
}
