package com.strategyImp.cn;

import com.strategy.cn.FlyingStrategy;

public class FlyWithRocket implements FlyingStrategy{

	public void performFly() {
		System.out.println("I fly with rocket ....");
	}

}
