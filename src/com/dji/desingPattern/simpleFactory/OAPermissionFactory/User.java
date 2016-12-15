/**
 * 
 */
/**
 * @author yancy.yang
 *
 */
package com.dji.desingPattern.simpleFactory.OAPermissionFactory;

public abstract class User {
	public void sameOperation() {
		System.out.println("modify personal profile");
	}
	
	public abstract void diffOperation();
}