package org.migueljrm95.albumsapi

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import io.swagger.v3.oas.annotations.servers.Server
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
@OpenAPIDefinition(
	info = Info(
		title = "Albums API",
		version = "1.0",
	),
	servers = [Server(url = "http://localhost:8080/",description = "v1.0")]
)
class AlbumsApiApplication

fun main(args: Array<String>) {
	runApplication<AlbumsApiApplication>(*args)
}
