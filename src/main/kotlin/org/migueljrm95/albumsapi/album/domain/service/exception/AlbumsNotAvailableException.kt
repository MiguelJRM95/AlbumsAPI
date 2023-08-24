package org.migueljrm95.albumsapi.album.domain.service.exception

import org.migueljrm95.albumsapi.shared.exception.ResourceNotAvailableException

class AlbumsNotAvailableException(message: String): ResourceNotAvailableException(message) {
    constructor() : this("The Albums resource is currently unavailable.")
}