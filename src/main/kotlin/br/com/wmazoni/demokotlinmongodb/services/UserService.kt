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
        val entity = getEntityById(id)
        return UserDTO(entity)
    }

    fun insert(dto: UserDTO): UserDTO {
        var entity = User()
        copyDtoToEntity(dto, entity)
        entity = userRepository.insert(entity)
        return UserDTO(entity)
    }

    fun update(id: String, dto: UserDTO): UserDTO {
        var entity = getEntityById(id)
        copyDtoToEntity(dto, entity)
        entity = userRepository.save(entity)
        return UserDTO(entity)
    }

    private fun copyDtoToEntity(dto: UserDTO, entity: User) {
        entity.name = dto.name
        entity.email = dto.email
    }

    private fun getEntityById(id: String): User {
        return userRepository.findById(id).orElseGet { throw ResourceNotFoundException("Objeto não encontrado") }
    }
}
