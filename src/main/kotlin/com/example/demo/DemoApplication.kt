package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	// branch2 の修正
	// branch2-2 の修正（これで上書きさせたい）
	runApplication<DemoApplication>(*args)
}
