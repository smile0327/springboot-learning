package com.kevin.study.springboot.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: kevin
 * @Description:
 * @Company: 上海博般数据技术有限公司
 * @Version: 1.0.0
 * @Date: Created in 10:31 2022/2/27
 * @ProjectName: springboot-learning
 */
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 注册自定义拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //注册拦截器
        registry.addInterceptor(new LoginInterceptor())
        // addPathPatterns:指定拦截路径，/**表示拦截所有请求
            .addPathPatterns("/**")
        // excludePathPatterns: 排除拦截路径，指定不需要被拦截器拦截的请求
            .excludePathPatterns("/", "/login");
    }

}
