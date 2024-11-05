package classandobject;

public class Box {
	int length,width,height,volume;
	
	public void setData(int l,int w,int h){
		length = l;
		width = w ;
		height = h;
	}
	public void showData() {
		 System.out.println("length="+length);
		 System.out.println("width="+width);
		 System.out.println("height="+height);
	}

}
