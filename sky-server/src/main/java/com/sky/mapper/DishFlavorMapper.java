package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    public void insertBatch(List<DishFlavor> flavors); //批量插入口味数据

    @Delete("delete from dish_flavor where dish_id = #{id}")
    public void deleteByDishId(Long id);//根据菜品id删除对应的口味
}
