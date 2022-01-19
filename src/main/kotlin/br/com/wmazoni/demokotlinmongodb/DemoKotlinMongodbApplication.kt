package br.com.wmazoni.demokotlinmongodb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoKotlinMongodbApplication

fun main(args: Array<String>) {
	runApplication<DemoKotlinMongodbApplication>(*args)
}
