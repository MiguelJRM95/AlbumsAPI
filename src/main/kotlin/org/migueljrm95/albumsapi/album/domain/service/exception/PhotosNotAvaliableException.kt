package org.migueljrm95.albumsapi.album.domain.service.exception

import org.migueljrm95.albumsapi.shared.exception.ResourceNotAvailableException

class PhotosNotAvaliableException (message: String): ResourceNotAvailableException(message) {
    constructor() : this("The Photos resource is currently unavailable.")
}