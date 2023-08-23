package org.migueljrm95.albumsapi.album.application.ports.output

import org.migueljrm95.albumsapi.album.domain.model.Album

interface AlbumsPort {
    fun getAlbums(): List<Album>
}