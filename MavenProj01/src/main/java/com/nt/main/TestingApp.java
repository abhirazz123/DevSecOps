package com.nt.main;

import com.nt.service.Arthmetic;

public class TestingApp {
	public static void main(String[] args) {
		Arthmetic ar = new Arthmetic();
		System.out.println("Result:"+ar.sum(10, 20));
	}

}
