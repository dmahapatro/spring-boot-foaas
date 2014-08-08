package com.foaas.spring.boot.web

import com.foaas.spring.boot.service.FoaasService
import com.sun.org.apache.xpath.internal.SourceTreeManager
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@EnableAutoConfiguration
@ComponentScan
@RestController
class FoaasController {

    //@Autowired
    //FoaasService foaasService

    @RequestMapping("/{from}/{to}")
    @ResponseBody
    String home(@PathVariable String from, @PathVariable String to) {
        //foaasService.message()

        return "Hello $to from $from!"
    }
}
