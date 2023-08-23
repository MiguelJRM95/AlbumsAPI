package org.migueljrm95.albumsapi.photo.application.ports.output

import org.migueljrm95.albumsapi.photo.domain.model.Photo

interface PhotosPort {
    fun getPhotos(albumId: Long): List<Photo>
}