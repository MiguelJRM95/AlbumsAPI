package org.migueljrm95.albumsapi.photo.domain.model

class Photo(
    val id: Long,
    val albumId: String,
    val title: String,
    val url: String,
    val thumbnailUrl: String,
)