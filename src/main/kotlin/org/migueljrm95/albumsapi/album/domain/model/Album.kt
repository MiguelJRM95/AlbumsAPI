package org.migueljrm95.albumsapi.album.domain.model

import org.migueljrm95.albumsapi.photo.domain.model.Photo

data class Album(
    val id: Long,
    val title: String,
    var photos: List<Photo>?
)