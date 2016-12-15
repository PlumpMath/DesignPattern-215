package com.dji.desingPattern.simpleFactory.OAPermissionFactory;

public class testQAPermission {

	public static void main (String args[]) {
		try {
			User user;
			user = UserFactory.getUser(2);
			user.sameOperation();
			user.diffOperation();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
