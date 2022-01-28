package br.com.wmazoni.demokotlinmongodb.resources

import br.com.wmazoni.demokotlinmongodb.dto.UserDTO
import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource(val userService: UserService) {

    @GetMapping
    fun findAll(): ResponseEntity<List<UserDTO>> {
        val list: List<UserDTO> = userService.findAll()
        return ResponseEntity.ok().body(list)
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: String): ResponseEntity<UserDTO> {
        val obj: UserDTO = userService.findById(id)
        return ResponseEntity.ok().body(obj)
    }
}