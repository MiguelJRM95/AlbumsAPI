package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.migueljrm95.albumsapi.album.application.ports.input.AlbumsController
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.AlbumsService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/albums")
class AlbumsRestController(private val albumsService: AlbumsService): AlbumsController{
    @GetMapping("", produces = [MediaType.APPLICATION_JSON_VALUE])
    override fun getAlbums(@RequestParam(name = "page", required = false, defaultValue = "1") page: Int): ResponseEntity<List<Album>> {
        val albums = albumsService.getAlbums(page)
        return ResponseEntity.ok(albums)
    }
}