package com.gjy.quick.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gjy.quick.entity.AddressBook;
import com.gjy.quick.mapper.AddressBookMapper;
import com.gjy.quick.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
