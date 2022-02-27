package com.kevin.study.springboot.service.impl;

import com.kevin.study.springboot.entity.Person;
import com.kevin.study.springboot.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Auther: kevin
 * @Description:
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 21:00 2022/2/26
 * @ProjectName: springboot-learning
 */
public class PersonServiceImpl implements PersonService {

    @Autowired
    private Person person;

    @Override
    public Person getPersonInfo() {
        return person;
    }

}
