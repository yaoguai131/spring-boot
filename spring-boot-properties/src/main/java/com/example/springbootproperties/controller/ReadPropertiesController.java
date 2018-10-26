package com.example.springbootproperties.controller;

import com.example.springbootproperties.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/read")
public class ReadPropertiesController {
    @Value("${com.dudu.name}")
    private  String name;
    @Value("${com.dudu.want}")
    private  String want;

    @Autowired
    ConfigBean configBean;

    @RequestMapping("/1")
    public Map<String, String> read1(){
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("方式1","通过注解@Value(value=”${config.name}”)就可以绑定到你想要的属性上面");
        resultMap.put("结果",this.name+this.want);
        return resultMap;
    }

    @RequestMapping("/2")
    public Map<String, String> read2(){
        Map<String, String> resultMap = new HashMap<>();
        resultMap.put("方式1","官方提倡绑定一个对象的bean");
        resultMap.put("结果",configBean.getName()+configBean.getWant());
        return resultMap;
    }
}
