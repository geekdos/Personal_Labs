package com.geekdos.presentation;

import com.geekdos.metier.SayHello;

public class app {

	public static void main(String[] args) {
		
		SayHello sayHello = new SayHello();
		
		System.out.println(sayHello.doSomthings());

	}

}
