/**
 * 
 */
package com.dji.designPattern.Factory.TVFactory;

/**
 * @author yancy.yang
 *
 */
public class LeTVFactory implements TVFactory {

	@Override
	public TV TVProduce() {
		System.out.println("LeTV is producing");
		return new LeTV();
	}

}
