package com.aurionpro.test;

import com.aurionpro.model.ICarFactory;
import com.aurionpro.model.ICars;
import com.aurionpro.model.MahindraFactory;
import com.aurionpro.model.MarutiFactory;
import com.aurionpro.model.TataFactory;

public class CarFactoryTest {

	public static void main(String[] args) {
		ICarFactory marutiFactory = MarutiFactory.getInstance();
		ICars maruti = marutiFactory.makeCar();
		maruti.start();
		maruti.stop();
		
		ICarFactory tataFactory =TataFactory.getInstance();
		ICars tata = tataFactory.makeCar();
		tata.start();
		tata.stop();
		
		ICarFactory mahindraFactory = MahindraFactory.getInstance();
		ICars mahindra = mahindraFactory.makeCar();
		mahindra.start();
		mahindra.stop();
		
		

	}

}
