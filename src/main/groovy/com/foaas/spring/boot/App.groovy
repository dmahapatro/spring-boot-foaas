package com.foaas.spring.boot

import com.foaas.spring.boot.web.FoaasController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@EnableAutoConfiguration
@ComponentScan
@Configuration
class App {
    public static void main(String[] args) {
        SpringApplication.run(FoaasController, args)
    }
}

