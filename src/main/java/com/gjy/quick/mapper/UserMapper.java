package com.gjy.quick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gjy.quick.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User>{
}
