package com.jewelbankers.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan({ "com" })
public class JewelBankers {

	@RequestMapping("/hell")
	String home() {
		return "Hello World!";
	}

	@RequestMapping("/roshan1")
	String roshan() {
		return "Hello Roshan!";
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JewelBankers.class, args);
		System.out.print(false);
	}

}