package com.automationversion1.mypackage;

public class Testdemo {

	static int subStirngcount(String str, String sub) {
		if (str.contains(sub)) {
			return 1 + subStirngcount(str.replaceFirst(sub, ""), sub);
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println(subStirngcount("aabbccbbccbb", "bb"));
	}

}
