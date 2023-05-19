
# spring docker compose
## Spring
## 使用Spring initializr初始化工程
https://start.spring.io/#!type=maven-project&language=java&platformVersion=3.1.1-SNAPSHOT&packaging=jar&jvmVersion=17&groupId=com.example&artifactId=demo&name=demo&description=Demo%20project%20for%20Spring%20Boot&packageName=com.example.demo&dependencies=web,data-jpa,lombok,configuration-processor,postgresql
## 修改pom.xml，添加依赖
```xml
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-docker-compose</artifactId>
        <optional>true</optional>
    </dependency>
```
## 添加docker-compose.yml
```yaml
version: '3.7'
services:
  db:
    image: postgres:15.3
    restart: always
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
      POSTGRES_DB: shop
    ports:
        - 5432:5432
```
compose中环境变量会注入到spring的环境中，所以不需要配置application.yml中的jdbc参数
## 添加CRUD
## 正常启动SpringBoot

# 启动入口类 ```DockerComposeListener```