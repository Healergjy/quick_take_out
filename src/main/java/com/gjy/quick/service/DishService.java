package com.gjy.quick.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjy.quick.dto.DishDto;
import com.gjy.quick.entity.Dish;

public interface DishService extends IService<Dish> {
    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表: dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);
    //通过菜品id获取菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);
    //修改菜品信息，同时修改对应的口味信息
    public void updateWithFlavor(DishDto dishDto);
}
