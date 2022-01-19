package br.com.wmazoni.demokotlinmongodb.models.entities

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "user")
class User(
    @Id
    var id: String?,
    var name: String,
    var email: String) {

}