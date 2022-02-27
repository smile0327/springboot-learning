package com.kevin.study.springboot.config;

import com.kevin.study.springboot.service.PersonService;
import com.kevin.study.springboot.service.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: kevin
 * @Description:
 * - @Configuration 注解用于定义一个配置类，相当于 Spring 的配置文件
 * - 配置类中包含一个或多个被 @Bean 注解的方法，该方法相当于 Spring 配置文件中的 <bean> 标签定义的组件。
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 20:59 2022/2/26
 * @ProjectName: springboot-learning
 */
@Configuration
public class MyAppConfig {

    @Bean
    public PersonService personService() {
        System.out.println("在容器中添加了一个组件:peronService");
        return new PersonServiceImpl();
    }

}
