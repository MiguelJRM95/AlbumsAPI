package org.migueljrm95.albumsapi.album.domain.service

import org.migueljrm95.albumsapi.album.application.ports.input.useCase.GetAlbumsUseCase
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.infrastructure.adapters.output.rest.AlbumsRestClient
import org.springframework.stereotype.Service

@Service
class AlbumsService(private val albumsRestClient: AlbumsRestClient): GetAlbumsUseCase {
    override fun getAlbums(): List<Album> {
        return albumsRestClient.getAlbums()
    }
}