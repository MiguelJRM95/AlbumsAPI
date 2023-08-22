package org.migueljrm95.albumsapi.album.domain.service

import org.migueljrm95.albumsapi.album.application.ports.input.useCase.GetAlbumsUseCase
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.springframework.stereotype.Service

@Service
class AlbumsService: GetAlbumsUseCase {
    override fun getAlbums(): List<Album> {
        return listOf(
            Album(1, "Album 1"),
            Album(2, "Album 2"),
            Album(3, "Album 3"),
        )
    }
}