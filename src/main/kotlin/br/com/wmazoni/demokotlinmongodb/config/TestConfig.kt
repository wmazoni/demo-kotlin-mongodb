package br.com.wmazoni.demokotlinmongodb.config

import br.com.wmazoni.demokotlinmongodb.models.entities.Post
import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.repositories.PostRepository
import br.com.wmazoni.demokotlinmongodb.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import javax.annotation.PostConstruct

@Configuration
@Profile("test")
class TestConfig {

    @Autowired
    lateinit var userRepository: UserRepository

    @Autowired
    lateinit var postRepository: PostRepository

    @PostConstruct
    fun init() {
        userRepository.deleteAll()
        postRepository.deleteAll()

        val maria = User(null, "Maria Brown")
        val alex = User(null, "Alex Green")
        val bob = User(null, "Bob Green")

        userRepository.saveAll(arrayListOf(maria, alex, bob))

    }
}