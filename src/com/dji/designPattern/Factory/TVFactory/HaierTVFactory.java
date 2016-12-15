package com.dji.designPattern.Factory.TVFactory;

import com.dji.designPattern.Factory.TVFactory.TVFactory;

public class HaierTVFactory implements TVFactory {

	@Override
	public TV TVProduce(){
		System.out.println("HaierTV is producing!");
		return new HaierTV();
	}
}
