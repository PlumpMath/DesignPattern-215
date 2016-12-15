package com.dji.designPattern.simpleFactory.OAPermissionFactory;

public class Administrator extends User {

	public Administrator() {
		System.out.println("Create Administrator Successfully!");
	}

	@Override
	public void diffOperation() {
		System.out.println("Can view and manage leave application");
	}
}
