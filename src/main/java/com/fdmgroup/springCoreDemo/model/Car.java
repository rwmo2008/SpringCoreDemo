package com.fdmgroup.springCoreDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("defaultCar")
//@Scope("singleton")
public class Car {
	private String make;
	private String model;
	//@Autowired
	//@Qualifier("standard")
	private Engine engine;
	
	
	@Autowired
	public Car(@Qualifier("standard") Engine engine) {
		super();
		this.engine = engine;
	}
	
	
	public Car(String make, String model, Engine engine) {
		super();
		this.make = make;
		this.model = model;
		this.engine = engine;
	}


	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", engine=" + engine + "]";
	}
	
}
