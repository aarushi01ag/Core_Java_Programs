package javaTPoint;

public class ObjectInitialiseByMethod {
	
	int rollNumber;
	String name;
	
	public void insertRecords(int x, String y)
	{
		rollNumber=x;
		name=y;
	}
	
	public void displayrecords() {
		System.out.println(rollNumber + " " + name);
	}
	
	public static void main(String[] args) {
		ObjectInitialiseByMethod obj1=new ObjectInitialiseByMethod();
		obj1.insertRecords(123,"aaru");
		obj1.displayrecords();
		
		

	}

}
