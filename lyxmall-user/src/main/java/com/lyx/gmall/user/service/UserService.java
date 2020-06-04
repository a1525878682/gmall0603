package com.lyx.gmall.user.service;

import com.lyx.gmall.user.bean.UmsMember;
import com.lyx.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {

    public List<UmsMember> getUserAll();



    List<UmsMemberReceiveAddress> findByAdds(String memberId);
}
