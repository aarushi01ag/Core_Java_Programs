
package java.programs.tpoint.programs;

public class Factorial {
    public static int findFact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * (findFact(n - 1)));
        }

    }

    public static void main(String[] args) {
        int n = 4;
        int fact = 1;
        int factorial = findFact(n);
        System.out.println(factorial);

    }
}

