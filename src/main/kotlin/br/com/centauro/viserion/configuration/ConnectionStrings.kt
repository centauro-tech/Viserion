package br.com.centauro.viserion.configuration

import org.springframework.stereotype.Component
import org.springframework.beans.factory.annotation.Value


@Component
public class ConnectionStrings {
    @Value("mongodb://\${spring.data.mongodb.username}:\${viserion@gruposbf}@\${spring.data.mongodb.host}:\${spring.data.mongodb.port}")
       lateinit var mongoDbConnectionString: String
}