package org.migueljrm95.albumsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class AlbumsApiApplication

fun main(args: Array<String>) {
	runApplication<AlbumsApiApplication>(*args)
}
