package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.AlbumsService
import org.migueljrm95.albumsapi.photo.domain.service.PhotosService
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@WebMvcTest(AlbumsRestController::class)
class AlbumsRestControllerTest(@Autowired val mockMvc: MockMvc) {

    @MockBean
    lateinit var albumsService: AlbumsService

    @MockBean
    lateinit var photosService: PhotosService
    @Test
    fun getCharacters() {
        Mockito.`when`(albumsService.getAlbums(page)).thenReturn(albums)

        mockMvc.perform(get("/api/v1/albums"))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$[0].title").isNotEmpty)
    }

    private companion object{
        private val albums =
            listOf(
                Album(1, "Album 1"),
                Album(2, "Album 2"),
                Album(3, "Album 3")
            )
        private val page = 1
    }
}