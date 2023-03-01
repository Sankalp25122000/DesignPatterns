package com.aurionpro.model;

public class TataFactory implements ICarFactory {
	private static TataFactory tataFactory;
	
	public static TataFactory getInstance() {
		if(tataFactory==null) {
			tataFactory= new TataFactory();
			}
		return tataFactory;
	}

	@Override
	public ICars makeCar() {
		// TODO Auto-generated method stub
		return  new Tata();
	}

}
