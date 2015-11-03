package com.alex.designpattern.singleton;

public class SingletonTwo {
	
	private static SingletonTwo instance = null;
	
	private static final Object mutex = new Object();
	
	private SingletonTwo(){}
	
	public static SingletonTwo getInstance() {
		if(instance == null) {
			synchronized (mutex) {
				if(instance == null) {
					instance = new SingletonTwo();
				}
			}
		}
		return instance;
	}
	
	private void sayHi() {
		
		System.out.println("-------hi---------");
	}

	public static void main(String[] args) {
		SingletonTwo.getInstance().sayHi();
	}
}
