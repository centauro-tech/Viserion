package br.com.centauro.viserion.services

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello(name: String = "World"): String = "Hello $name with Service"
}