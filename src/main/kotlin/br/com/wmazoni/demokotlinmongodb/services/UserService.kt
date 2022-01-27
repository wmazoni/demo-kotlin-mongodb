package br.com.wmazoni.demokotlinmongodb.services

import br.com.wmazoni.demokotlinmongodb.dto.UserDTO
import br.com.wmazoni.demokotlinmongodb.models.entities.User
import br.com.wmazoni.demokotlinmongodb.repositories.UserRepository
import br.com.wmazoni.demokotlinmongodb.services.exceptions.ResourceNotFoundException
import org.springframework.stereotype.Service

@Service
class UserService(val userRepository: UserRepository) {

    fun findAll(): List<UserDTO> {
        val list: List<User> = userRepository.findAll()
        return list.map { x -> UserDTO(x) }
    }

    fun findById(id: String): UserDTO {
        val result = userRepository.findById(id).orElseGet { throw ResourceNotFoundException("Objeto não encontrado") }
        return UserDTO(result)
    }
}
