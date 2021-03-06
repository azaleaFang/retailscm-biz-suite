package com.skynet.bootstrap;

import com.terapico.uccaf.UCInvocationServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.boot.autoconfigure.elasticsearch.rest.RestClientAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, RestClientAutoConfiguration.class, KafkaAutoConfiguration.class})
@ImportResource(locations = {"classpath:/META-INF/spring.xml", "classpath:/META-INF/online-system.xml"})
@ServletComponentScan(basePackageClasses = {UCInvocationServlet.class})
public class AppEntrance {
    public static void main(String[] args) {
        SpringApplication.run(AppEntrance.class, args);
    }

}
