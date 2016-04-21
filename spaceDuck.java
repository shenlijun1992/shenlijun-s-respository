package com.strategy.cn;

import com.strategyImp.cn.FlyNoWay;
import com.strategyImp.cn.FlyWithRocket;

public class spaceDuck extends Duck {
	public spaceDuck() {
		super();
		super.setFlyingStrategy(new FlyWithRocket());
	}

	public void display() {
		System.out.println(" I am space duck ...");
	}

}
