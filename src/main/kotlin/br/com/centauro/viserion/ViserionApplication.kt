package br.com.centauro.viserion

import br.com.centauro.viserion.configuration.ConnectionStrings
import com.mongodb.client.MongoClient
import com.mongodb.client.MongoClientFactory
import com.mongodb.client.MongoClients
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean

@SpringBootApplication
class ViserionApplication{
	@Autowired
	private lateinit var connectionStrings: ConnectionStrings

	@Bean
	fun mongoClient(): MongoClient {
		return MongoClients.create(connectionStrings.mongoDbConnectionString);
	}
}

fun main(args: Array<String>) {
	runApplication<ViserionApplication>(*args)
}
