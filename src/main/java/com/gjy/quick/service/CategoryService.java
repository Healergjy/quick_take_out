package com.gjy.quick.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.gjy.quick.entity.Category;

public interface CategoryService extends IService<Category> {

    public void remove(Long id);

}
