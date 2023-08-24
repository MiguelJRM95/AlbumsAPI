package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class AlbumsRestControllerIT(@Autowired val mockMvc: MockMvc) {

    @Test
    fun givenNoPage_whenGetCharacters_thenReturnOkStatus() {
        mockMvc.perform(get("/api/v1/albums"))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
    }

    @Test
    fun givenPage_whenGetCharacters_thenReturnOkStatus() {
        mockMvc.perform(get("/api/v1/albums?page=2"))
            .andExpect(status().isOk)
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
    }

    @Test
    fun givenPageWrongWay_whenGetCharacters_thenReturnNotFoundStatus() {
        mockMvc.perform(get("/api/v1/albums/page=2"))
            .andExpect(status().isNotFound)
    }

}