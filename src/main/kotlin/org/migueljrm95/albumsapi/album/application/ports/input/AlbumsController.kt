package org.migueljrm95.albumsapi.album.application.ports.input

import org.migueljrm95.albumsapi.album.domain.model.Album
import org.springframework.http.ResponseEntity




interface AlbumsController {
    fun getAlbums(page: Int): ResponseEntity<List<Album>>
}