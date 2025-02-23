package com.samrat.proj1;

import com.samrat.proj1.controller.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Proj1Application {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Proj1Application.class, args);

		Pizza pizza = ctx.getBean(Pizza.class) ;
		System.out.println(pizza.getVegPizza());
	}

}
