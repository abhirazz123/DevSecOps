package com.nt.main;

import com.nt.service.Arithmetic;

public class App {
    public static void main(String[] args) {
    Arithmetic ar = new Arithmetic();
    System.out.println("Result: "+ar.sum(100, 200));
    }
}
