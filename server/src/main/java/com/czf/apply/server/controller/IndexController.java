package com.czf.apply.server.controller;

import com.czf.apply.dao.entity.User;
import com.czf.apply.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 10098
 */
@Controller

public class IndexController {
    @Autowired
   private   UserSerivce userSerivce;

    @RequestMapping("/")
    public Object user(Model model){
        String code="a32206fe2c9d4b279c41280f339238f1";
       User user= userSerivce.getUser(code);
       model.addAttribute("user",user.getName());
        return  "index";
    }
}
