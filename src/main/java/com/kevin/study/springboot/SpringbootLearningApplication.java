package com.kevin.study.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//将 beans.xml 加载到项目中
//@ImportResource(locations = {"classpath:/beans.xml"})
@SpringBootApplication
public class SpringbootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLearningApplication.class, args);
	}

}
