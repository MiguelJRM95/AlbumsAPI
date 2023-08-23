package org.migueljrm95.albumsapi.album.domain.service

import org.migueljrm95.albumsapi.album.application.ports.input.useCase.GetAlbumsUseCase
import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.springframework.stereotype.Service

@Service
class AlbumsService(private val albumsPort: AlbumsPort): GetAlbumsUseCase {
    override fun getAlbums(page: Int): List<Album> {
        return albumsPort.getAlbums(page)
    }
}