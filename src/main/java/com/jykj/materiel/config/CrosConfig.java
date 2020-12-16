package com.jykj.materiel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author: hjl
 * @Date: 2020/12/8 0008 15:05
 */
@Configuration
public class CrosConfig  implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS","HEAD")
                .maxAge(3600)
                .allowedHeaders("*");
    }
}
