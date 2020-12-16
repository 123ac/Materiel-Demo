package com.jykj.materiel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //开启SwaggerUI
public class MaterielApplication {

    public static void main(String[] args) {
        SpringApplication.run(MaterielApplication.class, args);
    }

}
