package com.nt.main;
import com.nt.service.Arthmetic;
public class App {
    public static void main(String[] args) {
    	Arthmetic ar = new Arthmetic();
    	System.out.println("Result::"+ar.sum(100, 200));
    }
}
