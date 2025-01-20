
import java.util.ArrayList;

import java.util.LinkedList;

public class ArrayList2 {

	public static void main(String[] args) {


		ArrayList obj = new ArrayList();
		
		obj.add("virat");
		obj.add("dhoni");
		obj.add("kl rahul");
		obj.add("hardik");
		
		System.out.println(obj);
		
		LinkedList obj1 = new LinkedList<>();
		
		obj1.addAll(obj);
		System.out.println(obj1);
		
		obj1.add("driti");
		System.out.println(obj1);
		
		obj1.addFirst("veda");
		System.out.println(obj1);
		
		obj1.addLast("kriti");
		System.out.println(obj1);

	}

}
