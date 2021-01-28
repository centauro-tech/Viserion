package br.com.centauro.viserion

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ViserionApplication

fun main(args: Array<String>) {
	runApplication<ViserionApplication>(*args)
}
