package com.liuyi;

public class Son extends Father {
	public static void main(String[] args) {
		Father f = new Father();
		//f.show();
		f.show2();
		f.show3();
		f.show4();
		System.out.println("--------------");
		
		Son s = new Son();
		//s.show();
		s.show2();
		s.show3();
		s.show4();
	}
}
