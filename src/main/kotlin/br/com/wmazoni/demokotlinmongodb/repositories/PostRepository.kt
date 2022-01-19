package br.com.wmazoni.demokotlinmongodb.repositories

import br.com.wmazoni.demokotlinmongodb.models.entities.Post
import br.com.wmazoni.demokotlinmongodb.models.entities.User
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface PostRepository : MongoRepository<Post, String> {
}