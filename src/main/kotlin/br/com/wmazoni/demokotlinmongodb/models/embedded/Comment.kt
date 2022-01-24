package br.com.wmazoni.demokotlinmongodb.models.embedded

import java.time.Instant

data class Comment(var text: String, var moment: Instant, var author:Author) {
}