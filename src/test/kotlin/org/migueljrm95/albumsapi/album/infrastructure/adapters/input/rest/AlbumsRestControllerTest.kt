package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*


@WebMvcTest(AlbumsRestController::class)
class AlbumsRestControllerTest(@Autowired val mockMvc: MockMvc) {

    @Test
    fun getCharacters() {
        mockMvc.perform(get("/api/v1/albums"))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$[0].title").isNotEmpty)
    }
}