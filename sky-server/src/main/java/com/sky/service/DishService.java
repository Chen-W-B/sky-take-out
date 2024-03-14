package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

public interface DishService {
    public void saveWithFlavor(DishDTO dishDTO); //新增菜品

    public PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);//菜品分页查询

    public void deleteBatch(List<Long> ids); //批量删除菜品

    public DishVO getByIdWithFlavor(Long id);//根据id查询菜品--回显数据

    public void updateWithFlavor(DishDTO dishDTO); //修改菜品

    public void startOrStop(Integer status,Long dishId);//菜品起售/停售
}
