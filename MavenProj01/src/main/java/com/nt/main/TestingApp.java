package com.nt.main;

import com.nt.service.Arithmetic;

public class TestingApp {
	public static void main(String[] args) {
		Arithmetic ar = new Arithmetic ();
		System.out.println("Result:"+ar.sum(10, 20));
	}

}
