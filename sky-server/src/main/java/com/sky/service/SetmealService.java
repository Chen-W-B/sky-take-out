package com.sky.service;

import com.sky.dto.SetmealDTO;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.SetmealVO;

import java.util.List;

public interface SetmealService {
    public void saveWithDish(SetmealDTO setmealDTO);//新增套餐，同时需要保存套餐和菜品的关联关系

    public PageResult pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);//套餐分页查询

    public void deleteBatch(List<Long> ids);//批量删除套餐

    public SetmealVO findByIdWithDish(Long id);//根据id查询套餐

    public void update(SetmealDTO setmealDTO);//修改套餐

    public void startOrStop(Integer status,Long id);//套餐起售/停售
}
