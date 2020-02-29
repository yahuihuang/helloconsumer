package com.myyhhuang.helloconsumer.controller;

import com.myyhhuang.beanim.IMCounty;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFallback")
    public List<IMCounty> helloService() {
        //https://www.baeldung.com/spring-rest-template-list
        IMCountyList response = restTemplate.getForObject("http://HELLO-SERVICE/hello", IMCountyList.class);
        List<IMCounty> imCounties = response.getImCounties();
        return imCounties;
    }

    public List<IMCounty> helloFallback() {
        List<IMCounty> imCountyList = new LinkedList<IMCounty>();
        IMCounty imCounty = new IMCounty("ERROR", "ERROR", null, null);
        imCountyList.add(imCounty);

        return imCountyList;
    }
}
