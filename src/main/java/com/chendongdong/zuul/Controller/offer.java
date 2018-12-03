package com.chendongdong.zuul.Controller;

import com.chendongdong.zuul.feignDao.Offerdao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class offer {

    @Resource
    private Offerdao offerdao;

    @RequestMapping(value = "/getPost",method= RequestMethod.POST)
    public String getPost() {
        String post = offerdao.getPost();
        return offerdao.getPost();
    }
}
