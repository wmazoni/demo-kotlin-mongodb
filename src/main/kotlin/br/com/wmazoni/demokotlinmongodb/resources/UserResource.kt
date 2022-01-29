package br.com.wmazoni.demokotlinmongodb.resources

import br.com.wmazoni.demokotlinmongodb.dto.UserDTO
import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.services.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.support.ServletUriComponentsBuilder

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

    @PostMapping
    fun insert(@RequestBody dto: UserDTO): ResponseEntity<UserDTO> {
        val obj = userService.insert(dto)
        val uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.id).toUri()
        return ResponseEntity.created(uri).body(obj)
    }

    @PutMapping("/{id}")
    fun update(@PathVariable id: String, @RequestBody obj: UserDTO): ResponseEntity<UserDTO> {
        val result = userService.update(id, obj)
        return ResponseEntity.ok().body(result)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: String): ResponseEntity<UserDTO> {
        val obj = userService.delete(id)
        return ResponseEntity.noContent().build()
    }
}