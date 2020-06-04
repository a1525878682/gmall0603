package com.lyx.gmall.user.mapper;



import com.lyx.lyxmall.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMember> {

    public List<UmsMember> getUserAll();

//    public UmsMember findById(String id);
}
