package com.strategy.cn;

public abstract class Duck {
	private FlyingStrategy flyingStrategy;

	public void quack() {
		System.out.println("ga ga ga ...");
	}

	public abstract void display();

	public void setFlyingStrategy(FlyingStrategy flyingStrategy) {
		this.flyingStrategy = flyingStrategy;
	}

	public void fly() {
		flyingStrategy.performFly();
	}
}
