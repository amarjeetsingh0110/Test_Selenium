package com.fft.java;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		
		obj.doLogin("ajsingh0110@gmail.com", "Default Password");
		obj.doLogin(989978411, "Default Password");

	}

	public void doLogin(String email, String password) {
		
		System.out.println("Login with email" +email+ "  " +password);

	}
	
	public void doLogin(long mobile, String password) {
		System.out.println("Login with mobile" +mobile+ "  " +password);
	}
}
