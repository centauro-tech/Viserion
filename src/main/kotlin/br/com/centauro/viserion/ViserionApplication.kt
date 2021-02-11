package br.com.centauro.viserion

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.beans.factory.annotation
import br.com.centauro.viserion.configuration

@SpringBootApplication
class ViserionApplication{
	@Autowired
	private lateinit var connectionStrings: ConnectionStrings 
}

fun main(args: Array<String>) {
	runApplication<ViserionApplication>(*args)
}
