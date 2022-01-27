package br.com.wmazoni.demokotlinmongodb.models.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.DBRef
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
data class User(
    @Id var id: String?,
    val name: String,
    val email: String,
    @DBRef(lazy = true) var posts: ArrayList<Post>? = ArrayList()
) {

}