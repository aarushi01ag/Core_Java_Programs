package interview.programs;

public class CalculateAreaOfRectangle {
	
	float length;
	float breadth;
	float area=0;
	
	public void insertData(float l, float b) {
		length=l;
		breadth=b;
	}
	
	public float calculateArea() {
		area=length*breadth;
		return area;
	}
	
	public static void main(String[] args) {
		CalculateAreaOfRectangle obj1=new CalculateAreaOfRectangle();
		obj1.insertData(2.3f,3.4f);
		float result=obj1.calculateArea();
		System.out.println(result);
		
		
		

	}

}
