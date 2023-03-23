package com.gjy.quick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjy.quick.entity.OrderDetail;
import com.gjy.quick.mapper.OrderDetailMapper;
import com.gjy.quick.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper,OrderDetail> implements OrderDetailService {
}
