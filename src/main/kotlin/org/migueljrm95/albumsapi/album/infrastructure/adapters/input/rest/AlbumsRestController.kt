package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.migueljrm95.albumsapi.album.application.ports.input.AlbumsController
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.AlbumsService
import org.migueljrm95.albumsapi.photo.domain.model.Photo
import org.migueljrm95.albumsapi.photo.domain.service.PhotosService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/albums")
class AlbumsRestController(private val albumsService: AlbumsService, private val photosService: PhotosService): AlbumsController{
    @GetMapping
    override fun getAlbums(): ResponseEntity<List<Album>> {
        val albums = albumsService.getAlbums()
        return ResponseEntity.ok(albums)
    }

    @GetMapping("/{id}/photos")
    fun getPhotos(@PathVariable(name = "id") albumId: Long): ResponseEntity<List<Photo>>{
        val photos = photosService.getPhotos(albumId)
        return ResponseEntity.ok(photos)
    }
}