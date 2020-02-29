package com.myyhhuang.helloconsumer.controller;

import com.myyhhuang.beanim.IMCounty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "ribbon-consumer", method = RequestMethod.GET)
    public List<IMCounty> helloConsumer() {
        return helloService.helloService();
    }
}
