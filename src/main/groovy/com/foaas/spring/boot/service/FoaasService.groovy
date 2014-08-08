package com.foaas.spring.boot.service

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Service

@ComponentScan
@Configuration
@Service
class FoaasService {

    String message() {
        return "Hello Gr8 Conf!"
    }
}
