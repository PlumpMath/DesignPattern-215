package com.dji.desingPattern.simpleFactory.OAPermissionFactory;

public class Employee extends User {
	public Employee() {
		System.out.println("Create Employee Succeessfully!");
	}
	@Override
	public void diffOperation() {
		System.out.println("Can request out of office!");
	}
}
