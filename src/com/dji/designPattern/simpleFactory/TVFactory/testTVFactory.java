package com.dji.designPattern.simpleFactory.TVFactory;

public class testTVFactory {
	public static void main(String args[]) {
		try {
			TV tv;
			tv = TVFactory.produceTV("LeShi");
			tv.play();
		}catch(Exception e) {
			System.out.println(e.getMessage()); 
		}
	}
}
