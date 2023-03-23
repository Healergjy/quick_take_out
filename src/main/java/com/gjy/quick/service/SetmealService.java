package com.gjy.quick.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjy.quick.dto.SetmealDto;
import com.gjy.quick.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    //新增套餐，同时保存套餐与菜品的关联关系
    public void saveWithDish(SetmealDto setmealDto);
    //删除套餐，同时删除绑定的菜品
    public void removeWithDish(List<Long> ids);
    //获取套餐，同时获取套餐对应的菜品
    public SetmealDto getSetmealWithDish(Long id);
}
