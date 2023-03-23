package com.gjy.quick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gjy.quick.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
