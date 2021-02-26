package com.example.tutorialSpringBoot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TutorialSpringBootApplication

fun main(args: Array<String>) {
	runApplication<TutorialSpringBootApplication>(*args)
}
