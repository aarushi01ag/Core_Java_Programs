package javaTPoint.string;

public class Main {
    public static void main(String[] args){
        Animal a=new Animal();
        a.eat();
        Horse h=new Horse();
        h.eat();
        h.stop();
        Animal ah=new Horse();
        ah.eat();
        System.out.println(ah.i);

    }
}
