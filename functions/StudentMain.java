
public class StudentMain {
	public static void main(String args[]) {
	Student obj1 =new Student();
	obj1.setData(85,70,95,"Nikita","Pune");
	obj1.showData();
	double percentage =obj1.percentage();
	System.out.println("percentage="+percentage);
	int average=obj1.avg(88,80);
	System.out.println("average="+average);
	System.out.println();
	Student obj2 = new Student();
	obj2.setData(80,80,75,"Neha","Mumbai");
	obj2.showData();
	
	System.out.println(obj2.percentage());
	System.out.println(obj2.avg(98,70));
	
}
}
