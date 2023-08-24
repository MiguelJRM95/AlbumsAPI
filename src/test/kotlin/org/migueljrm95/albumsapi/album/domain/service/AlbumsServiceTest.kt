package org.migueljrm95.albumsapi.album.domain.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.photo.application.ports.output.PhotosPort
import org.migueljrm95.albumsapi.photo.domain.model.Photo
import org.mockito.ArgumentMatchers
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import org.mockito.kotlin.times
import org.mockito.kotlin.verify

@ExtendWith(MockitoExtension::class)
class AlbumsServiceTest {

    @Mock
    lateinit var albumsPort: AlbumsPort

    @Mock
    lateinit var photosPort: PhotosPort

    @InjectMocks
    lateinit var albumsService: AlbumsService

    @Test
    fun getAlbums() {
        Mockito.`when`(albumsPort.getAlbums(ArgumentMatchers.anyInt())).thenReturn(albums)
        val fetchedAlbums = albumsService.getAlbums(ArgumentMatchers.anyInt())
        verify(photosPort, times(3)).getPhotos(ArgumentMatchers.anyLong())
        assertNotNull(fetchedAlbums)
    }

    private companion object{
        private val photoAlbum1 = Photo(1, 1, "Photo 1", "xxxx", "xxxx")
        private val photoAlbum2 = Photo(2, 2, "Photo 2", "xxxx", "xxxx")
        private val photoAlbum3 = Photo(3, 3, "Photo 3", "xxxx", "xxxx")
        private val albums =
            listOf(
                Album(1, "Album 1", listOf(photoAlbum1)),
                Album(2, "Album 2", listOf(photoAlbum2)),
                Album(3, "Album 3", listOf(photoAlbum3))
            )
    }
}