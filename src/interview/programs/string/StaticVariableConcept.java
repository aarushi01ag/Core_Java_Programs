package interview.programs.string;

public class StaticVariableConcept {


    // A non-static variable
    int N;

    // Static method
    public static void increment() {

        StaticVariableConcept obj = new StaticVariableConcept();
       obj.N++;
       System.out.println(obj.N);


        // if we simply write as N++ without using object it gives error that non static variables cant be accessed from static content
        // this throws a compile - time error.


    }


    // Main method
    public static void main(String args[]) {
        // Creating multiple objects
        // for class A
        StaticVariableConcept obj1 = new StaticVariableConcept();
        StaticVariableConcept obj2 = new StaticVariableConcept();
        StaticVariableConcept obj3 = new StaticVariableConcept();

        // Assigning the different values
        // for the non static variable N
        obj1.N = 3;
        obj2.N = 4;
        obj3.N = 5;
//increment();
        // Calling the method
        //obj1.increment();

        System.out.println(obj1.N);
        System.out.println(obj2.N);
        System.out.println(obj3.N);
        increment();
    }

}
