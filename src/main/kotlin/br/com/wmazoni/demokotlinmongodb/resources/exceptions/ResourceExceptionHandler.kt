package br.com.wmazoni.demokotlinmongodb.resources.exceptions

import br.com.wmazoni.demokotlinmongodb.services.exceptions.ResourceNotFoundException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import javax.servlet.http.HttpServletRequest

@ControllerAdvice
class ResourceExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException::class)
    fun resourceNotFound(e: ResourceNotFoundException, request: HttpServletRequest): ResponseEntity<StandardError> {
        val status: HttpStatus = HttpStatus.NOT_FOUND
        val err: StandardError =
            StandardError(System.currentTimeMillis(), status.value(), "Not Found", e.message!!, request.requestURI)
        return ResponseEntity.status(status).body(err)
    }
}