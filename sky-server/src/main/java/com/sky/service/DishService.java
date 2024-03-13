package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {
    public void saveWithFlavor(DishDTO dishDTO); //新增菜品

    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);//菜品分页查询

    public void deleteBatch(List<Long> ids); //批量删除菜品
}
