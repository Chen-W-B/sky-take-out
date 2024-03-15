package com.sky.mapper;

import com.sky.entity.SetmealDish;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    public List<Long> getSetmealIdsByDishIds(List<Long> dishIds);//根据菜品id查询对应的套餐id

    public void insertBatch(List<SetmealDish> setmealDishes); //批量插入与套餐相关的菜品

    @Delete("delete from setmeal_dish where setmeal_id = #{setmealId}")
    public void deleteBySetmealId(Long setmealId);//根据套餐id删除关联的菜品

    @Select("select * from setmeal_dish where setmeal_id = #{setmealId}")
    public List<SetmealDish> findDishIdBySetmealId(Long setmealId);//根据套餐id查询关联的菜品
}
