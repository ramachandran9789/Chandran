package com.git;

public class Commad {
	private void get() {
		int i = 100;
		System.out.println(i);
		int a = 50;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Commad g = new Commad();
		g.get();
		System.out.println("Complete");
	}
}
