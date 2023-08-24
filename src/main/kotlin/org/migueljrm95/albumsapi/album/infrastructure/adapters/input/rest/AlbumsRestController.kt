package org.migueljrm95.albumsapi.album.infrastructure.adapters.input.rest

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.media.ArraySchema
import io.swagger.v3.oas.annotations.media.Content
import io.swagger.v3.oas.annotations.media.Schema
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import io.swagger.v3.oas.annotations.tags.Tag
import org.migueljrm95.albumsapi.album.application.ports.input.AlbumsController
import org.migueljrm95.albumsapi.album.domain.model.Album
import org.migueljrm95.albumsapi.album.domain.service.AlbumsService
import org.migueljrm95.albumsapi.shared.exception.model.ErrorDetails
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("api/v1/albums")
@Tag(name = "Albums Controller", description = "You can request info about albums.")
class AlbumsRestController(private val albumsService: AlbumsService): AlbumsController{
    @Operation(summary = "Search albums.")
    @ApiResponses(
        ApiResponse(
            responseCode = "200",
            description = "Fetched the albums correctly.",
            content = [
                Content(mediaType = "application/json",
                    array = ArraySchema(schema = Schema(implementation = Album::class)))
            ]
        ),
        ApiResponse(
            responseCode = "404",
            description = "Albums or photos client are not available.",
            content = [
                Content(mediaType = "application/json",
                    schema = Schema(implementation = ErrorDetails::class))
            ]
        )
    )
    @GetMapping("", produces = [MediaType.APPLICATION_JSON_VALUE])
    override fun getAlbums(@RequestParam(name = "page", required = false, defaultValue = "1") page: Int): ResponseEntity<List<Album>> {
        val albums = albumsService.getAlbums(page)
        return ResponseEntity.ok(albums)
    }
}