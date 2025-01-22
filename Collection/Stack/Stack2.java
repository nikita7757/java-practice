
import java.util.Stack;

public class Stack2 {

	public static void main(String[] args) {
		Stack<Integer> obj = new Stack<Integer>();
		
		obj.push(50);
		obj.push(60);
		obj.push(70);
		
		System.out.println(obj);
		
		System.out.println(obj.search(50));
		
		obj.push(10);
		System.out.println(obj);
		System.out.println(obj.search(10));
		
		

	}

}
