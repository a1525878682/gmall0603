package com.lyx.lyxmall.service;


import com.lyx.lyxmall.bean.UmsMember;
import com.lyx.lyxmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    public List<UmsMember> getUserAll();



    List<UmsMemberReceiveAddress> findByAdds(String memberId);
}
