package br.com.wmazoni.demokotlinmongodb.config

import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.repositories.PostRepository
import br.com.wmazoni.demokotlinmongodb.repositories.UserRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Configuration

@Configuration
class Instantiation(val userRepository: UserRepository, val postRepository: PostRepository) : CommandLineRunner {
    override fun run(vararg args: String?) {
        userRepository.deleteAll()
        postRepository.deleteAll()
        val maria = User(null, "Maria Brown", "maria@gmail.com")
        val alex = User(null, "Alex Green", "alex@gmail.com")
        val bob = User(null, "Bob Grey", "bob@gmail.com")

        userRepository.saveAll(arrayListOf(maria, alex, bob))
    }
}