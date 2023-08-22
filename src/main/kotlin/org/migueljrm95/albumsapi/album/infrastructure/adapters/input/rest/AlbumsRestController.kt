package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.migueljrm95.albumsapi.album.application.ports.input.AlbumsController
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.AlbumsService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/albums")
class AlbumsRestController(private val albumsService: AlbumsService): AlbumsController{
    @GetMapping
    override fun getAlbums(): ResponseEntity<List<Album>> {
        val albums = albumsService.getAlbums()
        return ResponseEntity.ok(albums)
    }
}