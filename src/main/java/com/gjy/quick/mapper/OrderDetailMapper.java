package com.gjy.quick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gjy.quick.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}