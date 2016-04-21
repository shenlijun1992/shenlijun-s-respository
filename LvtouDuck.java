package com.strategy.cn;

import com.strategyImp.cn.FlyWithWin;

public class LvtouDuck extends Duck {
	public LvtouDuck() {
		super();
		super.setFlyingStrategy(new FlyWithWin());
	}

	public void display() {
		System.out.println("Green head duck...");
	}
}
