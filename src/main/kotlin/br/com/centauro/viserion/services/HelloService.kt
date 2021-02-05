package br.com.centauro.viserion.services

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun getHello(name: String = "World"): String {
        return "Hello $name with Service"
    }
}