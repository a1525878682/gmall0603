package com.lyx.gmall.user.controller;

import com.lyx.gmall.user.bean.UmsMember;
import com.lyx.gmall.user.bean.UmsMemberReceiveAddress;
import com.lyx.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUserAll")
    @ResponseBody
    public List<UmsMember> getUserAll() {
        List<UmsMember> list = userService.getUserAll();
        return list;

    }

    @RequestMapping("findByAdds")
    @ResponseBody
    public List<UmsMemberReceiveAddress> findByAdds( String memberId) {
        List<UmsMemberReceiveAddress> list = userService.findByAdds(memberId);
        return list;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index() {
        return "hello！！！！";
    }
}
