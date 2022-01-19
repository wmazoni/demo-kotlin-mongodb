package br.com.wmazoni.demokotlinmongodb.models.embedded

import br.com.wmazoni.demokotlinmongodb.models.entities.User
import org.springframework.data.annotation.Id

class Author(@Id var id: String?, var name: String) {

}