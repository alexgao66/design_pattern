package com.alex.designpattern.singleton;

public class SingletonOne {
	
	private static final SingletonOne instance = new SingletonOne();
	
	private SingletonOne(){}
	
	public static SingletonOne getInstance() {
		return instance;
	}
	
	private void sayHi() {
		System.out.println("-------hi---------");
	}

	public static void main(String[] args) {
		SingletonOne.getInstance().sayHi();
	}

}
