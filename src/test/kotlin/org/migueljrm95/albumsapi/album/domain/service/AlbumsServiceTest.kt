package org.migueljrm95.albumsapi.album.domain.service

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension

@ExtendWith(MockitoExtension::class)
class AlbumsServiceTest {

    @Mock
    lateinit var albumsPort: AlbumsPort

    @InjectMocks
    lateinit var albumsService: AlbumsService

    @Test
    fun getAlbums() {
        Mockito.`when`(albumsPort.getAlbums()).thenReturn(albums)
        val fetchedAlbums = albumsService.getAlbums()
        assertNotNull(fetchedAlbums)
    }

    private companion object{
        private val albums =
            listOf(
                Album(1, "Album 1"),
                Album(2, "Album 2"),
                Album(3, "Album 3")
            )
    }
}