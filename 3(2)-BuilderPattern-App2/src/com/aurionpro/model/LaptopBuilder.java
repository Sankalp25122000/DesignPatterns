package com.aurionpro.model;

public class LaptopBuilder {
	private Laptop laptop;

	public LaptopBuilder() {
		this.laptop = new Laptop();
	}

	public LaptopBuilder addRam(String ram) {
		laptop.setRam(ram);
		return this;

	}

	public LaptopBuilder addHdd(String hdd) {
		laptop.setHdd(hdd);
		return this;

	}

	public LaptopBuilder addKeyBoard(String keyBoard) {
		laptop.setKeyBoard(keyBoard);
		return this;

	}

	public LaptopBuilder addMouse(String mouse) {
		laptop.setMouse(mouse);
		return this;

	}

	public LaptopBuilder addTouchScreen(boolean touch) {
		laptop.setTouchScreen(true);
		return this;

	}
	public Laptop getLaptop() {
		return laptop;
	}
	

}
