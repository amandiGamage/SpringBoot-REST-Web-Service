/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wearit.service.custom;

import com.wearit.model.Category;
import com.wearit.service.SuperService;


public interface CategoryService extends SuperService<Category>{
    public Category getCategoryByName(String name)throws Exception;
    
}
