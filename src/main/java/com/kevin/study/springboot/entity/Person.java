package com.kevin.study.springboot.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Auther: kevin
 * @Description:
 * - @ConfigurationProperties：告诉 SpringBoot 将本类中的所有属性和配置文件中相关的配置进行绑定；
 * - prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 20:34 2022/2/26
 * @ProjectName: springboot-learning
 */
@Component
@ConfigurationProperties(prefix = "person")
@Data
public class Person {

    private String lastName;
    private Integer age;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

}
