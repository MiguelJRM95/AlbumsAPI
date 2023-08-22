package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/albums")
class AlbumsRestController {
    @GetMapping
    fun getCharacters(): ResponseEntity<List<String>> {
        return ResponseEntity.ok(listOf("Albums"))
    }
}