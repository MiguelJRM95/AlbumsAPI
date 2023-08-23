package org.migueljrm95.albumsapi.album.infrastructure.adapters.output.rest

import org.migueljrm95.albumsapi.album.application.ports.output.AlbumsPort
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam

@Component
@FeignClient(name = "Albums", url = "https://jsonplaceholder.typicode.com")
interface AlbumsRestClient: AlbumsPort {
    @RequestMapping(method = [RequestMethod.GET], value = ["/albums?_limit=2"])
    override fun getAlbums(@RequestParam(name = "_page") page: Int): List<Album>
}