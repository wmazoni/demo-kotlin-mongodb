package br.com.wmazoni.demokotlinmongodb.models.entities

import br.com.wmazoni.demokotlinmongodb.models.embedded.Author
import br.com.wmazoni.demokotlinmongodb.models.embedded.Comment
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

class Post(@Id var id: String?, var moment: Instant, var title: String, var body: String, author: Author,
           var comments: List<Comment>) {

}