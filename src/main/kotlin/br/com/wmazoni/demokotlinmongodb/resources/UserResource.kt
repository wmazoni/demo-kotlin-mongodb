package br.com.wmazoni.demokotlinmongodb.resources

import br.com.wmazoni.demokotlinmongodb.models.entities.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/users")
class UserResource {

    @GetMapping
    fun findAll(): ResponseEntity<MutableList<User>> {
        val maria = User("1", "Maria Brown", "maria@gmail.com")
        val alex = User("2", "Maria Silva", "maria@gmail.com")
        val list: MutableList<User> = mutableListOf()
        list.addAll(arrayListOf(maria, alex))
        return ResponseEntity.ok(list)
    }
}