package br.com.wmazoni.demokotlinmongodb.dto

import br.com.wmazoni.demokotlinmongodb.models.entities.User

class UserDTO(var id: String? = null, var name: String = "", var email: String = "") {
    constructor(entity: User) : this(id = entity.id, name = entity.name, email = entity.email) {
    }

}