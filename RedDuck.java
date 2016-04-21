package com.strategy.cn;

import com.strategyImp.cn.FlyWithWin;

public class RedDuck extends Duck {
	public RedDuck() {
		super();
		super.setFlyingStrategy(new FlyWithWin());
	}

	public void display() {
		System.out.println("Red head duck...");
	}
}
