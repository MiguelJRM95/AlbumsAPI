package org.migueljrm95.albumsapi.photo.domain.model

data class Photo(
    val id: Long,
    val albumId: Long,
    val title: String,
    val url: String,
    val thumbnailUrl: String,
)