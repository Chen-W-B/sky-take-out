package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {

    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    public Integer countByCategoryId(Long id);

    @AutoFill(value = OperationType.UPDATE)
    public void update(Setmeal setmeal); //修改套餐

    @AutoFill(value = OperationType.INSERT)
    public void insert(Setmeal setmeal); //新增套餐

    public Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);//分页查询

}
