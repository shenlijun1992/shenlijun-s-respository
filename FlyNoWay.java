package com.strategyImp.cn;

import com.strategy.cn.FlyingStrategy;

public class FlyNoWay implements FlyingStrategy{

	public void performFly() {
		System.out.println("I can't flying ...");
	}

}
