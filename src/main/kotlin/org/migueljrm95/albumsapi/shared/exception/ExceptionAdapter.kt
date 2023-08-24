package org.migueljrm95.albumsapi.shared.exception

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.context.request.WebRequest
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler
import java.util.*

@RestControllerAdvice
class ExceptionAdapter: ResponseEntityExceptionHandler() {
    @ExceptionHandler(value = [ResourceNotAvailableException::class])
    private fun handleResourceNotAvailable(ex: ResourceNotAvailableException, request: WebRequest): ResponseEntity<ErrorsDetails>{
        val error = ErrorsDetails(Date(), ex.message, ex.code)
        return ResponseEntity(error, HttpStatus.BAD_REQUEST)
    }

    private companion object{
        private data class ErrorsDetails(val time: Date, val message: String?, val code: String)
    }
}