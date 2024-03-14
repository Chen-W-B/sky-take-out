package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;

public interface SetmealService {
    public void saveWithDish(SetmealDTO setmealDTO);//新增套餐，同时需要保存套餐和菜品的关联关系

    public PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);//套餐分页查询
}
