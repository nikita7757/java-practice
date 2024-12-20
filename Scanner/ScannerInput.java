
import java.util.*;
public class ScannerInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name:");
		String name = sc.next();
		System.out.println("name= "+name);
		
		System.out.println("Enter your last name:");
		String lname = sc.next();
		System.out.println("last name ="+lname);
		
		System.out.println("Enter your marks:");
		int marks = sc.nextInt();
		System.out.println("marks= "+marks);
		
		System.out.println("Enter your percentage:");
	    float percentage= sc.nextInt();
		System.out.println("percentage ="+percentage);
		
		sc.nextLine();
		
		System.out.println("Enter your Address:");
		String Address = sc.nextLine();
		System.out.println("Address= "+Address);
	}

}
