package org.migueljrm95.albumsapi.photo.domain.service

import org.migueljrm95.albumsapi.photo.application.ports.input.useCase.GetPhotosUseCase
import org.migueljrm95.albumsapi.photo.application.ports.output.PhotosPort
import org.migueljrm95.albumsapi.photo.domain.model.Photo
import org.springframework.stereotype.Service

@Service
class PhotosService(private val photosPort: PhotosPort): GetPhotosUseCase {
    override fun getPhotos(albumId: Long): List<Photo> {
        return photosPort.getPhotos(albumId)
    }
}