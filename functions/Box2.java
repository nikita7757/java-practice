/*  functions with parameter and without return value. */
public class Box2 {
	
	int length,width,height,volume,perimeter;
	
	public void setData(int l, int w, int h) {
		length = l;
		height = h;
		width =w;
	}
	
	public void showData() {
		 System.out.println("length="+length);
		 System.out.println("width="+width);
		 System.out.println("height="+height);
	}
	public void volumCalc() {
		volume =length*height*width;
		System.out.println("volume="+volume);
	}
}
