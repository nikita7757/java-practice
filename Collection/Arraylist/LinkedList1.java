
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("nikita");
		obj.add("Riya");
		obj.add("Priya");
		obj.add("ayushka");
		obj.add("akshada");
		
		System.out.println(obj);
		
		obj.addFirst("siya");
		System.out.println(obj);
		
		obj.addLast("deepti");
		System.out.println(obj);
		
		obj.add(2, "jiya");
		System.out.println(obj);
		
		obj.remove();
		System.out.println(obj);
		
		obj.remove(2);
		System.out.println(obj);
		
		obj.remove("deepti");
		System.out.println(obj);
	}

}
