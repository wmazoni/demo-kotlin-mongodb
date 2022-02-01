package br.com.wmazoni.demokotlinmongodb.models.entities

import br.com.wmazoni.demokotlinmongodb.models.embedded.Author
import br.com.wmazoni.demokotlinmongodb.models.embedded.Comment
import org.springframework.data.annotation.Id
import java.time.Instant

data class Post(
    @Id var id: String? = null,
    var moment: Instant,
    var title: String,
    var body: String,
    val author: Author,
    var comments: ArrayList<Comment>? = ArrayList()
) {
}