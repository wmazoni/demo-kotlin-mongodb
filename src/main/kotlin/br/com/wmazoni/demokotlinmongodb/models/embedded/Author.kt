package br.com.wmazoni.demokotlinmongodb.models.embedded

import br.com.wmazoni.demokotlinmongodb.models.entities.User

class Author(entity: User) {
    val id: String
    val name: String

    init {
        id = entity.id!!
        name = entity.name
    }
}