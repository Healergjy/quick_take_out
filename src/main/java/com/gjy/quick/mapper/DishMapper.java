package com.gjy.quick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gjy.quick.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
