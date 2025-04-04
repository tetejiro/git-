package com.example.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApplication

fun main(args: Array<String>) {
	// branch2 の修正
<<<<<<< HEAD
=======
	// branch2-2 の修正（これで上書きさせたい）
>>>>>>> aa4dba4b4636274fbf38e4192c4586a1242c5212
	runApplication<DemoApplication>(*args)
}
