package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	// branch2 の修正
	// branch2-1 の修正（これを削除させたい）
	runApplication<DemoApplication>(*args)
}
