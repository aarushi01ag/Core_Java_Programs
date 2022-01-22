package javaTPoint;

public class ObjectByRefernce2 {

	public static void main(String[] args) {
		PrintingObjectsValue obj1=new PrintingObjectsValue();
		PrintingObjectsValue obj2=new PrintingObjectsValue();
		obj1.id="123";
		obj1.name="aaru";
		obj2.id="124";
		obj2.name="sris";
		System.out.println(obj1.id +" " +obj1.name);
		System.out.println(obj2.id+ " " +obj2.name);
		

	}

}
