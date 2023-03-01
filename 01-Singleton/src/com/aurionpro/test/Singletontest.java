package com.aurionpro.test;

import com.aurionpro.model.Singleton;

public class Singletontest {

	public static void main(String[] args) {

		Singleton obj = Singleton.getInstance();
		Singleton obj1 = Singleton.getInstance();
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());

	}

}
