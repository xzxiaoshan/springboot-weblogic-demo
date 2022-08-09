# springboot-weblogic-demo
springboot 部署到 weblogic 中

**修改说明如下**  

1、pom.xml 对 tomcat 依赖的处理  
2、添加 WarServletInitializer.java 类  
3、配置 weblogic.xml 文件，注意这个不是必须的，如果你项目启动时出现了[包冲突问题](https://blog.csdn.net/catoop/article/details/126241647)才需要添加这个文件配置，否则不需要

