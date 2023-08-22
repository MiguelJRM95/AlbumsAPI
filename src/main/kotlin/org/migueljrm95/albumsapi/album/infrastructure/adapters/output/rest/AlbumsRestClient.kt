package org.migueljrm95.albumsapi.album.infrastructure.adapters.output.rest

import org.migueljrm95.albumsapi.album.domain.model.Album
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Component
@FeignClient(name = "Albums", url = "https://jsonplaceholder.typicode.com")
interface AlbumsRestClient {
    @RequestMapping(method = [RequestMethod.GET], value = ["/albums"])
    fun getAlbums(): List<Album>
}