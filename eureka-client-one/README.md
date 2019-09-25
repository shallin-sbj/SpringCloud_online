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