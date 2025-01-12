package com.acc.arrayList;

import java.util.ArrayList;

public class ElementChk {

	public static void main(String[] args) {
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(10);
		obj.add(45);
		obj.add(50);
		obj.add(20);
		obj.add(80);
		
		System.out.println(obj);
		
		boolean chk = obj.contains(30);
		
		if(chk) {
			System.out.println("element exist");
		}
		else {
			System.out.println("doesnt exist");
		}
		
	}

}
