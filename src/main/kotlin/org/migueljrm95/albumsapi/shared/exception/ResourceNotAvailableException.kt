package org.migueljrm95.albumsapi.shared.exception

abstract class ResourceNotAvailableException(
    message: String,
    cause: Exception?,
    val code: String = "RESOURCE_NOT_AVAILABLE"
): RuntimeException(message, cause) {
    constructor(message: String) : this(message, null)
}