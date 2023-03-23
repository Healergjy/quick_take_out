package com.gjy.quick.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gjy.quick.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
