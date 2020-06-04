package com.lyx.gmall.user.service.impl;

import com.lyx.gmall.user.bean.UmsMember;
import com.lyx.gmall.user.bean.UmsMemberReceiveAddress;
import com.lyx.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.lyx.gmall.user.mapper.UserMapper;
import com.lyx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

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
