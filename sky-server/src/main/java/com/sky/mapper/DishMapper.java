package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    public Integer countByCategoryId(Long categoryId);

    @AutoFill(value = OperationType.INSERT)
    public void insert(Dish dish); //新增菜品

    public Page<DishVO> pageQuery(DishPageQueryDTO dishPageQueryDTO); //菜品分页查询

    @Select("select * from dish where id = #{id}")
    public Dish findById(Long id); //根据id查询菜品

    @Delete("delete from dish where id = #{id}")
    public void deleteById(Long id); //根据id删除菜品

}
