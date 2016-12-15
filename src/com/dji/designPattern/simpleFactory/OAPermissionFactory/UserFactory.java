package com.dji.designPattern.simpleFactory.OAPermissionFactory;

public class UserFactory {

	public static User getUser (int permission) throws Exception{
		if(permission == 0) {
			return new Employee();
		} else if(permission == 1) {
			return new Manager();
		} else if(permission == 2) {
			return new Administrator();
		} else {
			throw new Exception();
		}
	} 
}
