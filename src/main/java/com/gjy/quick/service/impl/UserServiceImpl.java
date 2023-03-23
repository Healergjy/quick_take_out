package com.gjy.quick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjy.quick.entity.User;
import com.gjy.quick.mapper.UserMapper;
import com.gjy.quick.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
