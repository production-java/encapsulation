package com.encapsulation.workers;

public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Worker obj = new Worker();
		
		obj.setWorkerEmpSsn(9999999);
		obj.setWorkerEmpYearOfBirth(2001);
		obj.setWorkerEmpFirstName("Max");
		obj.setWorkerEmpLastName("Vavrusa");
		
		System.out.println("This is the workers ssn" + obj.getWorkerEmpSsn());
		System.out.println("This is the workers year of birth" + obj.getWorkerEmpYearOfBirth());
		System.out.println("This is the workers first name" + obj.getWorkerEmpFirstName());
		System.out.println("This is the workers last name"+ obj.getWorkerEmpLastName());

	}

}
