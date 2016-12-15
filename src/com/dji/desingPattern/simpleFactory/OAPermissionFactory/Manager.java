package com.dji.desingPattern.simpleFactory.OAPermissionFactory;

public class Manager extends User {

	public Manager() {
		System.out.println("Create Manager Successfully!");
	}

	@Override
	public void diffOperation() {
		System.out.println("Manager can review and inspect leave application");
	}

}
