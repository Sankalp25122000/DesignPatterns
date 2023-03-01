package com.aurionpro.test;

import com.aurionpro.model.Laptop;
import com.aurionpro.model.LaptopBuilder;

public class LaptopTest {

	public static void main(String[] args) {
		LaptopBuilder builder = new LaptopBuilder();
		Laptop laptop1 = builder.addHdd("SSD").addKeyBoard("Zebronics").addMouse("Logitech").addTouchScreen(true)
				.addRam("LPDD").getLaptop();

		System.out.println(laptop1);

	}

}
