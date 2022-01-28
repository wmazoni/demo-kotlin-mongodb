package br.com.wmazoni.demokotlinmongodb.services.exceptions

import java.lang.RuntimeException

class ResourceNotFoundException(message: String?) : RuntimeException(message) {
}