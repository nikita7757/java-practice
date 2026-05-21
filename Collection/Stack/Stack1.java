package com.acc.List;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {
		Stack <Integer>obj = new Stack<>();
		
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.push(60);
		
		System.out.println(obj);
		
		obj.push(80);
		System.out.println(obj);
		
		obj.pop();
		System.out.println(obj);
		
		System.out.println(obj.peek());	//gives topmost element
		
		
	}

}
