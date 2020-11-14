package com.company;

public class Validation {
	public static boolean stringCheck(String value) {
		if (((value != null) && (!value.equals("")) && (value.matches("^[a-zA-Z]*$")))){
			return true;
		}else {
			System.out.println("Please enter valid Input !");
			return false;
		}
	}
}
