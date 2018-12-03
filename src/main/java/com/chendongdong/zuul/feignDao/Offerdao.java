package com.chendongdong.zuul.feignDao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "offer")
public interface Offerdao {
    @RequestMapping(value = "/getPost", method = RequestMethod.POST)
    String getPost();
}
