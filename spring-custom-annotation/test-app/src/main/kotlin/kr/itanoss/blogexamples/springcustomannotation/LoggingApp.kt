package kr.itanoss.blogexamples.springcustomannotation

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import kotlin.random.Random

@SpringBootApplication
@EnablePerformanceMonitor
class LoggingApp : CommandLineRunner {
    @LogExecutionTime
    override fun run(vararg args: String?) {
        Thread.sleep(Random.nextLong(500, 5000))
        println("Wait enough...")
    }
}

fun main(args: Array<String>) {
    SpringApplication.run(LoggingApp::class.java)
}