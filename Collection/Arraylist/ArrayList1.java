
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList1 {

	public static void main(String[] args) {

		ArrayList<String> obj = new ArrayList();
		
		obj.add("nisha");
		obj.add("neha");
		obj.add("nikita");
		
		System.out.println(obj);
		
		obj.add(0,"supriya");
		System.out.println(obj);
		
		obj.add(0,"niku");
		System.out.println(obj);
		
		obj.add(0,"Deepti");
		System.out.println(obj);
		
		obj.remove("niku");
		System.out.println(obj);
		
		obj.remove(0);
		System.out.println(obj);
		
		Collections.sort(obj);
		System.out.println(obj);
		
		Collections.reverse(obj);
		System.out.println(obj);
	}

}
