# 快速入门样例-SpringBoot

## 引言

### [SpringBoot](https://springdoc.cn/spring-boot/)

> Spring Boot 是一个基于 Spring 框架的开源框架，它可以帮助开发人员快速创建独立的、生产级别的 Spring 应用程序。Spring Boot 的目标是简化 Spring 应用程序的开发和部署流程，通过自动配置和约定优于配置的方式，减少了开发人员的配置工作，从而提高了应用程序的可维护性和可扩展性。
>
> Spring Boot 体现了 ==MVC(Model-View-Controller)==思想中的一些方面。MVC 是一种应用程序架构模式，它将应用程序分为三个主要组件：模型 (Model)、视图 (View) 和控制器 (Controller)。模型表示应用程序的数据和业务逻辑，视图显示模型的状态，控制器接受用户输入并更新模型和视图。
>
> 在 Spring Boot 中，控制器组件通常是指 Spring MVC 框架，它提供了对 MVC 模式的支持。Spring MVC 中的核心概念是控制器对象，它代表了应用程序中的处理逻辑，负责接收用户请求并将其转发到相应的视图。
>
> Spring Boot 还提供了一些其他组件，支持 MVC 模式的使用。例如，Spring Boot 提供了与数据库集成的集成框架，可以帮助开发人员快速创建关系型数据库应用程序。此外，Spring Boot 还提供了一些其他的框架和工具，如 Spring Data JPA、Spring Security 等，这些框架和工具都可以使开发人员更容易地实现 MVC 模式中的各个组件。
>
> 以下是 SpringBoot 的一些重要特性:
>
> 1. ==依赖注入 (DI)==:SpringBoot 支持依赖注入，这意味着开发人员不再需要手动管理对象创建和依赖关系。Spring Boot 会自动检测和注入依赖关系，使代码更加简单和可读性更高。
> 2. ==控制反转 (IOC)==:SpringBoot 支持控制反转，这意味着应用程序的控制逻辑被转移到框架中，开发人员只需要编写业务逻辑。Spring Boot 提供了 IoC 容器，可以自动管理应用程序中的对象生命周期和依赖关系。
> 3. ==面向切面 (AOP)==:SpringBoot 支持面向切面编程，这意味着开发人员可以专注于业务逻辑，而不必处理底层细节。Spring Boot 提供了 AOP 支持，可以方便地配置和启用面向切面编程。
> 4. ==starter==:SpringBoot 包含了一些预配置的组件，这些组件可以加快应用程序的开发速度。例如，Spring Boot 包含了一些预配置的 ORM 框架、数据库集成、Web 框架等。
> 5. ==自动配置==:Spring Boot 提供了自动配置功能，这意味着开发人员不需要手动配置应用程序的各种组件。Spring Boot 可以根据应用程序的需求，==自动配置相关的组件==，例如数据库连接、Web 服务器、消息队列等。
>
> 这些特性使得 SpringBoot 成为一个非常流行的 Java 开发框架，它可以帮助开发人员快速创建高质量的、可扩展的、生产级别的应用程序。

## [MyBatis-Plus](https://baomidou.com/pages/24112f/)

> Mybatis-Plus 是一个基于 MyBatis 的开源框架，它主要是为了解决 MyBatis 在处理大量数据时的性能问题而设计的。MyBatis-Plus 提供了一些额外的功能，如==事务管理、性能优化、映射配置==等，使得开发人员在编写 SQL 语句时更加简单和高效。
>
> MyBatis-Plus 的核心特性包括:
>
> 1. 支持批量插入、批量更新、批量删除:MyBatis-Plus 可以方便地实现批量操作，减少了 SQL 语句的复杂度和性能压力。
> 2. 自动事务管理:MyBatis-Plus 可以自动管理事务，避免了手动管理事务的复杂度和错误。
> 3. 优化 SQL 语句:MyBatis-Plus 可以根据查询条件进行 SQL 语句优化，提高了查询性能。
> 4. 映射配置:MyBatis-Plus 支持自定义映射配置，使开发人员可以更加灵活地处理数据。
>
> MyBatis-Plus 是一个免费的开源框架，可以用于各种规模的应用程序开发。它可以帮助开发人员提高 MyBatis 的使用性能和效率，同时还提供了一些额外的功能，如批量操作、事务管理、SQL 优化等。

## [Lombok](https://blog.csdn.net/ThinkWon/article/details/101392808)

> Lombok 是一个开源工具，它可以帮助开发人员简化 Java 对象的注释和代码风格。Lombok 的核心特性包括:
>
> 1. ==自动提取属性==:Lombok 可以通过注解自动提取类中的属性，减少了开发人员的工作量。
> 2. ==简化注释==:Lombok 可以通过注解简化 Java 对象的注释，使得注释更加简洁明了。
> 3. ==优化代码风格==:Lombok 可以通过自定义样式优化 Java 代码的风格，如减少冗余的注释、简化变量命名等。
> 4. ==支持自定义注解==:Lombok 支持自定义注解，开发人员可以使用注解来描述自己的需求。
>
> Lombok 可以帮助开发人员简化 Java 对象的注释和代码风格，同时还可以提高代码的可读性和可维护性。它是一个免费的开源工具，可以用于各种规模的应用程序开发。

## [Maven](https://www.runoob.com/maven/maven-tutorial.html)

> Maven 是一种开源的软件构建工具，它可以帮助开发人员==构建、测试和部署==应用程序。Maven 的主要功能包括:
>
> 1. 下载和安装依赖项:Maven 可以帮助开发人员下载和安装应用程序所需的各种依赖项，避免了手动管理依赖项的复杂性。
> 2. 构建和打包应用程序:Maven 可以自动处理应用程序的构建和打包，使开发人员可以更加方便地构建和部署应用程序。
> 3. 测试和验证应用程序:Maven 可以帮助开发人员测试和验证应用程序，确保应用程序的质量和可靠性。
> 4. 部署应用程序:Maven 可以将应用程序打包成可执行的包，并将它们部署到服务器或其他设备上。
>
> Maven 是一种命令行工具，它可以在命令行中执行各种构建任务。==Maven 的核心概念是依赖项，它可以帮助开发人员管理应用程序所需的各种依赖项==。Maven 还支持版本控制，开发人员可以使用版本控制工具来跟踪和管理应用程序的依赖项和代码。Maven 是一个免费的开源工具，可以用于各种规模的应用程序开发。

## [Hutool](https://hutool.cn/docs/#/)

> Hutool 是一个基于 Java 的开源工具库，它提供了许多实用的工具方法，可以帮助开发人员更加高效地处理数据、字符串、日期等方面的问题。以下是 Hutool 的一些主要功能和特点:
>
> 1. 数据转换:Hutool 提供了多种方式将数据转换为其他格式，例如将字符串转换为整数、浮点数、日期等。它还提供了反转换的功能，使开发人员可以轻松地将数据从一个格式转换为另一个格式。
> 2. 字符串处理:Hutool 提供了大量的字符串处理方法，例如截取、拼接、替换、提取等。它还支持字符串的比较、匹配、正则表达式等操作，使开发人员可以轻松地处理字符串。
> 3. 日期时间处理:Hutool 提供了日期时间的处理方法，例如获取当前日期时间、格式化日期时间、比较日期时间等。它还支持日期时间的加减、闰年判断等操作。
> 4. 数字处理:Hutool 提供了数字处理的方法和工具，例如获取整数、浮点数、科学计数法等。它还支持数字的加减、除以、取模等操作。
> 5. 集合处理:Hutool 提供了多种集合处理方法，例如添加、删除、替换、排序、去重等。它还支持集合的迭代、遍历、映射等操作。
> 6. 异常处理:Hutool 提供了异常处理的方法，例如捕获、打印、记录日志等。它还支持异常类型的枚举、排序、聚合等操作。
> 7. 其他功能:Hutool 还提供了许多其他功能，例如文件上传、下载、压缩、解压缩、内存管理、网络请求等。它是一个非常全面的工具库，可以帮助开发人员快速解决各种数据处理和字符串处理方面的问题。
>
> 总之，Hutool 是一个非常实用的 Java 工具库，它提供了许多方便实用的方法和工具，使开发人员可以更加高效地处理数据、字符串、日期时间等问题。

以IDEA为例

## 创建工程

填写名称、GroupId、ArtifactId

![image-20230421114948126](https://gitee.com/xzxwbb/cloud-image/raw/master/img/image-20230421114948126.png)



基本的工程目录结构

```
├─common 通用
│  └─enums 枚举
├─config 配置
├─controller 控制器
├─dto 数据传输对象
├─handler 处理器
├─interceptor 拦截器
├─mapper dao
├─pojo 实体类
├─service 服务接口
│  └─impl 服务实现类
└─util 工具类
    └─generator 代码生成器
```



在pom.xml添加需要的依赖

```xml
<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!--MP-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.4.3.4</version>
        </dependency>
        <!--mybatis-plus 代码生成器依赖-->
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-generator</artifactId>
            <version>3.3.1.tmp</version>
            <exclusions>
                <exclusion>
                    <artifactId>mybatis-plus-extension</artifactId>
                    <groupId>com.baomidou</groupId>
                </exclusion>
            </exclusions>
        </dependency>

        <dependency>
            <groupId>cn.hutool</groupId>
            <artifactId>hutool-all</artifactId>
            <version>5.8.9</version>
        </dependency>
        <!--freemarker 依赖--> <!--模板引擎-->
        <dependency>
            <groupId>org.freemarker</groupId>
            <artifactId>freemarker</artifactId>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
```

重建resource/application.yml，添加自己的配置

```yaml
server:
  port: 8888


spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://127.0.0.1:3306/test_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai
    username: root
    password: root
    hikari:
      # 连接池名
      pool-name: DateHikariCP
      # 最小空闲连接数
      minimum-idle: 5
      # 空闲连接存活最大时间，默认600000（10分钟）
      idle-timeout: 180000
      # 最大连接数，默认10
      maximum-pool-size: 10
      # 从连接池返回的连接的自动提交
      auto-commit: true
      # 连接最大存活时间，0表示永久存活，默认1800000（30分钟）,数据库的最大超时时间为24小时
      max-lifetime: 900000
      # 连接超时时间，默认30000（30秒）
      connection-timeout: 30000
      # 测试连接是否可用的查询语句
      connection-test-query: SELECT 1

  # jackson配置
  jackson:
    # json和对象的命名转换
    property-naming-strategy: SNAKE_CASE
    date-format: yyyy-MM-dd HH:mm:ss
    locale: zh
    time-zone: GMT+8
    default-property-inclusion: NON_EMPTY
    deserialization:
      # 允许对象忽略json中不存在的属性 该字段为null，不传输
      fail_on_unknown_properties: false
    parser:
      # 允许出现特殊字符和转义符
      allow_unquoted_control_chars: true
      # 允许出现单引号
      allow_single_quotes: true


# mybatis-plus配置
mybatis-plus:
  global-config:
    db-config:
      table-prefix: test_ # 表名前缀
      id-type: auto #主键id自增
  configuration:
    # 日志级别，开发可用，运维调整级别
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
    map-underscore-to-camel-case: true
  mapper-locations: classpath*:/mapper/**/*Mapper.xml
  type-aliases-package: com.xzx.quickstart.pojo


# 设置日志级别，root表示根节点，即整体应用日志级别
logging:
  # 日志级别
  level:
    root: info
    # 格式
  #  pattern:
  #    console: "%d %clr(%p) --- [%16t] %clr(%-40.40c){cyan} : %m %n"
  file:
    name: server.log
  logback:
    rollingpolicy:
      max-file-size: 1MB
      file-name-pattern: server.%d{yyyy-MM-dd}.%i.log

```

