package interview.programs;

public class MainOutsideClass {
	
	//in this we have our main method in another class and we want to print the values of variables initialized in ClassA.
	//so we have created object of classA.

	public static void main(String[] args) {
		PrintingObjectsValue obj1=new PrintingObjectsValue();
		System.out.println(obj1.id);
		System.out.println(obj1.name);

	}

}
