## Maven 导入POM依赖
```groovy
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>jstl</artifactId>
</dependency>
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
</dependency>
```

## 配置文件
```
spring.mvc.view.prefix: /WEB-INF/jsp/
spring.mvc.view.suffix: .jsp
```

# 编写页面
在main/webapp/WEB-INF/jsp下
写welcome.jsp
```jsp
<!DOCTYPE html>
<html lang="en">
<body>
Time:  ${time}
<br>
Message: ${message}
</body>
</html>
```

写WelcomeController.java

```java
@Controller
public class WelcomeController {

    @GetMapping("/")
    public String welcome(Map<String,Object> model){
        model.put("time",new Date());
        model.put("message","hello world!");
        return "welcome";
    }
}
```

