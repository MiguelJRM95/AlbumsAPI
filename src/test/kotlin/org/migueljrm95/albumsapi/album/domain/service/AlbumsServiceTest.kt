package org.migueljrm95.albumsapi.album.domain.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.photo.application.ports.output.PhotosPort
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

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
        Mockito.`when`(albumsPort.getAlbums(page)).thenReturn(albums)
        val fetchedAlbums = albumsService.getAlbums(page)
        assertNotNull(fetchedAlbums)
    }

    private companion object{
        private val albums =
            listOf(
                Album(1, "Album 1", null),
                Album(2, "Album 2", null),
                Album(3, "Album 3", null)
            )
        private val page = 1
    }
}