package br.com.cotacao.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
@ComponentScan("br.com.cotacao")
public class App {

	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("Spring-Quartz.xml");
		SpringApplication.run(App.class, args);
	}

}
