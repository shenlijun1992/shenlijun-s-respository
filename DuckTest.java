package com.strategy.cn;

import com.strategy.cn.Duck;
import com.strategy.cn.spaceDuck;

public class DuckTest {
	public static void main(String[] args) {
		System.out.println("����Ѽ�ӳ���ʼ...");
		System.out.println("*********");
		Duck duck = new LvtouDuck();
		duck.quack();
		duck.display();
		duck.fly();
		System.out.println("*********");
		System.out.println("����Ѽ�ӳ������...");
	}

}
