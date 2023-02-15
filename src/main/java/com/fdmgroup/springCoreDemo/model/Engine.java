package com.fdmgroup.springCoreDemo.model;

public class Engine {
	private double displacementInLiters;

	public Engine(double displacementInLiters) {
		super();
		this.displacementInLiters = displacementInLiters;
	}

	public double getDisplacementInLiters() {
		return displacementInLiters;
	}

	public void setDisplacementInLiters(double displacementInLiters) {
		this.displacementInLiters = displacementInLiters;
	}

	@Override
	public String toString() {
		return "Engine [displacementInLiters=" + displacementInLiters + "]";
	}
	
}
