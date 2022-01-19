package br.com.wmazoni.demokotlinmongodb.config

import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.repositories.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import javax.annotation.PostConstruct

@Configuration
@Profile("test")
class TestConfig {

    @Autowired
    lateinit var userRepository: UserRepository

    @PostConstruct
    fun init() {
        userRepository.deleteAll()

        val maria = User(null, "Maria Brown", "maria@gmail.com")
        val alex = User(null, "Alex Green", "alex@gmail.com")
        val bob = User(null, "Bob Green", "bob@gmail.com")

        userRepository.saveAll(arrayListOf(maria, alex, bob))

    }
}