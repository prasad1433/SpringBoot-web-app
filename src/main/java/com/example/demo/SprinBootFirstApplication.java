package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SprinBootFirstApplication {

	public static void main(String[] args) {
		
	ApplicationContext ac =	SpringApplication.run(SprinBootFirstApplication.class, args);
		//read object(Bean) using  getBean(objname,classname.class);
		//get bean
	MessageService mc = ac.getBean("messageService", MessageService.class);
	mc.getMsg();
	}

}
