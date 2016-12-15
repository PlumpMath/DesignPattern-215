package com.dji.designPattern.Factory.TVFactory;

public class testTVFactory {
	public static void main(String args []) {
		TV tv;
		TVFactory tvFactory;
		tvFactory = new LeTVFactory();
		tv = tvFactory.TVProduce();
		tv.play();
	}
}
