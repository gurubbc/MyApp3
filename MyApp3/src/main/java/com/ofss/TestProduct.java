package com.ofss;

public class TestProduct {

	public static void main(String[] args) {
		Product p=new Product("SmartPhone",45000);
		System.out.println(p.getProductName()+" and "+p.getProductPrice());
		System.out.println("This is built through jenkins");
		System.out.println("This is just amazing");
		System.out.println("Integration from github to jenkins Aug 6 - 2020");
		System.out.println("2nd try...it should success");

	}

}
