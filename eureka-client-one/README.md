加入springboot admin 
1.添加依赖
```$xslt
                <dependency>
                    <groupId>de.codecentric</groupId>
                    <artifactId>spring-boot-admin-starter-client</artifactId>
                    <version>2.1.6</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-starter-actuator</artifactId>
                </dependency>
        
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-hystrix</artifactId>
                    <version>1.4.7.RELEASE</version>
                </dependency>
                <dependency>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-starter-hystrix-dashboard</artifactId>
                    <version>1.4.7.RELEASE</version>
                </dependency>
        
                <!-- 在管理界面中与 JMX-beans 进行交互所需要被依赖的 JAR -->
                <dependency>
                    <groupId>org.jolokia</groupId>
                    <artifactId>jolokia-core</artifactId>
                </dependency>
```
2. 配置属性文件
```$xslt
spring:
  application:
    name: service-lucy
  boot:
    admin:
      client:
        instance:
#          prefer-ip: true
        url: http://localhost:5001
logging:
  file: "logs/eureka-client-one.log"

management:
  endpoints:
    health:
      show-details: always
    web:
      exposure:
        base-path: /
        include: '*'

```
3. 开启注解
```$xslt
@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
```