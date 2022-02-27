package com.kevin.study.springboot.controller;

import com.kevin.study.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: kevin
 * @Description:
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 20:22 2022/2/26
 * @ProjectName: springboot-learning
 */
@Controller
public class HelloController {

    @Autowired
    private Person person;

    @ResponseBody
    @RequestMapping("/hello")
    public Person hello(){
        return person;
    }

}
