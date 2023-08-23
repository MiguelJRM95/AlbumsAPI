package org.migueljrm95.albumsapi.photo.infrastructure.adapters.output.rest

import org.migueljrm95.albumsapi.photo.application.ports.output.PhotosPort
import org.migueljrm95.albumsapi.photo.domain.model.Photo
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Component
@FeignClient(name = "Photos", url = "https://jsonplaceholder.typicode.com")
interface PhotosRestClient: PhotosPort {
    @RequestMapping(method = [RequestMethod.GET], value = ["/albums/{id}/photos"])
    override fun getPhotos(@PathVariable(value = "id") albumId: Long): List<Photo>
}