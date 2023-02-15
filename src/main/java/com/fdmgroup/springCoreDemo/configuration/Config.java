package com.fdmgroup.springCoreDemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fdmgroup.springCoreDemo.model.Car;
import com.fdmgroup.springCoreDemo.model.Engine;

@Configuration
@ComponentScan(basePackages = {"com.fdmgroup.springCoreDemo"} )
public class Config {
	
	@Bean
	//@Primary
	public Engine standardEngine() {
		return new Engine(2.0);
	}
	
	@Bean("ecoBoost")
	public Engine fordEcoBoostEngine() {
		return new Engine(2.3);
	}
	
	@Bean
	public Engine fordCoyoteEngine() {
		return new Engine(5.0);
	}
	
	@Bean
	public Car fordMustangFastback(Engine ecoBoost) {
		Car car = new Car(ecoBoost);
		car.setMake("Ford");
		car.setModel("Mustang");
		//car.setEngine(ecoBoost);
		return car;
	}
	
	@Bean
	public Car fordMustangGt() {
		Car car = new Car(fordCoyoteEngine());
		car.setMake("Ford");
		car.setModel("Mustang");
		//car.setEngine(fordCoyoteEngine());
		return car;
	}
}
