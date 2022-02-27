## Spring Boot配置绑定

1. @ConfigurationProperties
   
    ```
    @ConfigurationProperties(prefix = "person")
    ```
* 批量绑定属性与配置文件中的配置。prefix = "person"：配置文件中哪个下面的所有属性进行一一映射。
* 标注在类名上

2. @Value
* 绑定单个属性
* 标注在属性上

3. @PropertySource

```
@PropertySource(value = "classpath:person.properties")//指向对应的配置文件
@Component
@ConfigurationProperties(prefix = "person")
```
   将配置单独抽取出来时，通过该属性指向具体的配置文件。同时yml中不用在配置。
   

## Spring Boot加载Spring配置
1. @ImportResource
```
@ImportResource(locations = {"classpath:/beans.xml"})
@SpringBootApplication
public class HelloworldApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloworldApplication.class, args);
    }
}
```
   在启动类上加上@ImportResource注解，并指定Spring的配置文件。

2. 全注解方式加载——推荐
* 使用 @Configuration 注解定义配置类，替换 Spring 的配置文件
* 配置类内部定义有一个或多个被 @Bean 注解的方法

## Spring Boot Profile(多环境配置)
```
application-{profile}.properties/yml
```
   {profile}各环境简称，例如：dev,prod,test等。application.properties/yml为主配置文件,可在其中
   指定properties。例如(指定为生产环境配置)：
```
# properties写法
spring.profiles.active=prod
# yml写法
spring:
  profiles:
    active: prod
```

## Spring Boot拦截器

步骤：
1. 定义拦截器
      
   实现 HandlerInterceptor 接口
   
2. 注册拦截器

   创建一个实现了 WebMvcConfigurer 接口的配置类（使用了 @Configuration 注解的类），重写 addInterceptors() 方法，并在该方法中调用
   registry.addInterceptor() 方法将自定义的拦截器注册到容器中
   
3. 指定拦截器规则

   注册拦截器之后就可以指定拦截器规则。