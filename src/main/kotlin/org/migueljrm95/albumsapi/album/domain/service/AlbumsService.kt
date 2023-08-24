package org.migueljrm95.albumsapi.album.domain.service

import org.migueljrm95.albumsapi.album.application.ports.input.useCase.GetAlbumsUseCase
import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.exception.AlbumsNotAvailableException
import org.migueljrm95.albumsapi.album.domain.service.exception.PhotosNotAvaliableException
import org.migueljrm95.albumsapi.photo.application.ports.output.PhotosPort
import org.migueljrm95.albumsapi.photo.domain.model.Photo
import org.springframework.stereotype.Service

@Service
class AlbumsService(private val albumsPort: AlbumsPort, private val photosPort: PhotosPort): GetAlbumsUseCase {
    override fun getAlbums(page: Int): List<Album> {
        val albums: List<Album>
        try {
            albums = albumsPort.getAlbums(page)
        }catch (e: Exception){
            throw AlbumsNotAvailableException()
        }
        for (album: Album in albums){
            album.photos = getAlbumPhotos(album.id)
        }
        return albums
    }

    private fun getAlbumPhotos(albumId: Long): List<Photo>{
        try {
            return photosPort.getPhotos(albumId)
        }catch (e: Exception){
            throw PhotosNotAvaliableException()
        }
    }
}