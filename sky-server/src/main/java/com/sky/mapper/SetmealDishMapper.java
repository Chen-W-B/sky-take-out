package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    public List<Long> getSetmealIdsByDishIds(List<Long> dishIds);//根据菜品id查询对应的套餐id

    public void insertBatch(List<SetmealDish> setmealDishes);
}
