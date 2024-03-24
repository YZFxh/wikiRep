package com.jiawa.wiki.config;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;
@ComponentScan("com.jiawa")
//如果需要扫描多个包
//@ComponentScan({"com.jiawa","com.test"})
@SpringBootApplication
public class WikiApplication {
    //private static final Logger logger= (Logger) LoggerFactory.getLogger(WikiApplication.class);
    private static final org.slf4j.Logger LOG = LoggerFactory.getLogger(WikiApplication.class);
    public static void main(String[] args) {
        //SpringApplication applicationContext = (SpringApplication) SpringApplication.run(WikiApplication.class, args);
        SpringApplication app = new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("启动成功了");
        LOG.info("启动地址是localhost:{}",env.getProperty("server.port"));

    }

}
