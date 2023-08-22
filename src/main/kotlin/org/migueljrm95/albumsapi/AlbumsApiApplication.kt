package org.migueljrm95.albumsapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AlbumsApiApplication

fun main(args: Array<String>) {
	runApplication<AlbumsApiApplication>(*args)
}
