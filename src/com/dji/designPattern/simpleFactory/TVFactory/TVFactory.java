package com.dji.designPattern.simpleFactory.TVFactory;

public class TVFactory {
	public static TV produceTV(String brand) throws Exception {
		if(brand.equalsIgnoreCase("Haier")) {
			System.out.println("TV Factory is producing Haier TV");
			return new HaierTV();
		}else if (brand.equalsIgnoreCase("Leshi")) {
			System.out.println("TV Factory is producing LeTV");
			return new LeTV();
		}else {
			throw new Exception("Sorry, the fatory cannot produce this brand TV!");
		}
	}
}
