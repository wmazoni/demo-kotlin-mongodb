package br.com.wmazoni.demokotlinmongodb.resources.exceptions

data class StandardError(
    val timestamp: Long,
    val status: Int,
    val error: String,
    val message: String,
    val path: String
) {
}