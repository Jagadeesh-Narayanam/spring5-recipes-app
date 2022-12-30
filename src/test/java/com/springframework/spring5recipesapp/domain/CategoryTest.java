package com.springframework.spring5recipesapp.domain;


import com.springframework.spring5recipesapp.domain.Category;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CategoryTest {
    Category category;
    @Before
    public void setUp(){
        category = new Category();
    }
    @Test
    public void getId() throws Exception{
        Long val = 4L;
        category.setId(val);
        assertEquals(val,category.getId());

    }
    @Test
    public void getDescription() throws Exception{

    }
    @Test
    public void getRecipes() throws Exception{

    }
}