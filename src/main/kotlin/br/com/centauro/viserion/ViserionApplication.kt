package br.com.centauro.viserion

import br.com.centauro.viserion.configuration.ConnectionStrings
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.beans.factory.annotation.Autowired

@SpringBootApplication
class ViserionApplication{
	@Autowired
	private lateinit var connectionStrings: ConnectionStrings
}

fun main(args: Array<String>) {
	runApplication<ViserionApplication>(*args)
}
