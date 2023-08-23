package org.migueljrm95.albumsapi.photo.application.ports.input.useCase

import org.migueljrm95.albumsapi.photo.domain.model.Photo

interface GetPhotosUseCase {
    fun getPhotos(albumId: Long): List<Photo>
}