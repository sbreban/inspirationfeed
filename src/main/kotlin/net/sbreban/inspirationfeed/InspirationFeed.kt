package net.sbreban.inspirationfeed

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class InspirationFeed

fun main(args: Array<String>) {
    SpringApplication.run(InspirationFeed::class.java, *args)
}