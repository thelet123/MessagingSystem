package com.systems.Messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MessagingSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessagingSystemApplication.class, args);
	}

}
