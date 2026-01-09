package com.xworkz.student.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@ComponentScan("com.xworkz.student")
public class WebConfiguration {
    public WebConfiguration(){
        System.out.println("Web Configuration is called");
    }
}
