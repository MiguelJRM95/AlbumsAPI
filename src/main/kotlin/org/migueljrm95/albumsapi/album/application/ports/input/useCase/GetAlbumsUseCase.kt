package org.migueljrm95.albumsapi.album.application.ports.input.useCase

import org.migueljrm95.albumsapi.album.domain.model.Album

interface GetAlbumsUseCase {
    fun getAlbums(): List<Album>
}