package br.com.wmazoni.demokotlinmongodb.models.embedded

import br.com.wmazoni.demokotlinmongodb.models.entities.User
import org.springframework.data.annotation.Id
import java.time.Instant

class Comment(var text: String, var moment: Instant, var author:Author) {

}