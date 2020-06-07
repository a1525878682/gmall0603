package com.lyx.lyxmall.user.impl;


import com.alibaba.dubbo.config.annotation.Service;
import com.lyx.lyxmall.bean.UmsMember;
import com.lyx.lyxmall.bean.UmsMemberReceiveAddress;
import com.lyx.lyxmall.service.UserService;
import com.lyx.lyxmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.lyx.lyxmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

//import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;


    @Override
    public List<UmsMember> getUserAll() {
        return userMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> findByAdds(String memberId) {
        Example example  = new Example(UmsMemberReceiveAddress.class);
        example.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> list = umsMemberReceiveAddressMapper.selectByExample(example);
        return list;
    }


}
