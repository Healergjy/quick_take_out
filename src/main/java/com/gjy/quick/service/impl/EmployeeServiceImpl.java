package com.gjy.quick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjy.quick.entity.Employee;
import com.gjy.quick.mapper.EmployeeMapper;
import com.gjy.quick.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
