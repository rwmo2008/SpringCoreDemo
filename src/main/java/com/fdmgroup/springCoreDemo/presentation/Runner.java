package com.fdmgroup.springCoreDemo.presentation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fdmgroup.springCoreDemo.configuration.Config;
import com.fdmgroup.springCoreDemo.model.Car;
import com.fdmgroup.springCoreDemo.model.Engine;

public class Runner {

	public static void main(String[] args) {
		//Car car = new Car();
		//System.out.println("car is: "+ car);
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		
		Engine fordEcoBoostEngine = context.getBean("ecoBoost", Engine.class);
		System.out.println("ecoBoostEngine is: " + fordEcoBoostEngine);
		
		Engine fordCoyoteEngine = context.getBean("fordCoyoteEngine", Engine.class);
		System.out.println("fordCoyoteEngine is: " + fordCoyoteEngine);
		
		Car fordMustangFastback = context.getBean("fordMustangFastback", Car.class);
		System.out.println("MustangFastback is: " + fordMustangFastback);
		
		Car fordMustangGt = context.getBean("fordMustangGt", Car.class);
		System.out.println("MustangGt is: " + fordMustangGt);
		
		Car car1 = context.getBean("defaultCar", Car.class);
		System.out.println("car1 is : " + car1);
		
		Car car2 = context.getBean("defaultCar", Car.class);
		System.out.println("car2 is: " + car2);
		
		System.out.println("car1 == car2 : " + (car1 == car2));
		
		context.close();
	}

}
