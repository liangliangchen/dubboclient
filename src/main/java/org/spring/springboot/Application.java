package org.spring.springboot;

import org.spring.springboot.dubbo.PersonConsumeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by cll on 2018/8/22.
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		PersonConsumeService personConsumeService = run.getBean(PersonConsumeService.class);
		personConsumeService.printPerson();
	}
}
