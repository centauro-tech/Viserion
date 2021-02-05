package br.com.centauro.viserion.controllers

import br.com.centauro.viserion.dtos.HelloDto
import br.com.centauro.viserion.services.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController(val helloService: HelloService) {
    @GetMapping("/hello")
    fun helloKotlin(@RequestParam(value = "name", defaultValue = "World") name: String): String = "Hello $name"

    @GetMapping("/hello-dto")
    fun helloKotlinDto(@RequestParam(value = "name", defaultValue = "World") name: String) = HelloDto("Hello $name")

    @GetMapping("/hello-service")
    fun helloKotlinService(@RequestParam(value = "name", defaultValue = "World") name: String): String = helloService.getHello(name)
}