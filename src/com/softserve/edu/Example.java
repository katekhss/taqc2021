package com.softserve.edu;

public class Example {
	private int i;
	
	public void myprint(String msg) {
		System.out.println(msg + i);
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Example e = new Example();
		e.i=1;
		//System.out.println(e.i);
		e.myprint("ex");
	}
}