package br.com.wmazoni.demokotlinmongodb.dto

import br.com.wmazoni.demokotlinmongodb.models.entities.User

class UserDTO(entity: User) {
    val id: String
    val name: String
    val email: String

    init {
        id = entity.id!!
        name = entity.name
        email = entity.email
    }
}