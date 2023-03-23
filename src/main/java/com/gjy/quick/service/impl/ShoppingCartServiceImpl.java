package com.gjy.quick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjy.quick.entity.ShoppingCart;
import com.gjy.quick.mapper.ShoppingCartMapper;
import com.gjy.quick.service.ShoppingCartService;
import org.springframework.stereotype.Service;

@Service
public class ShoppingCartServiceImpl extends ServiceImpl<ShoppingCartMapper, ShoppingCart> implements ShoppingCartService {
}
