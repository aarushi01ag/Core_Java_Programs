package interview.programs.synchronizedprintoddevenno;

public class SharedPrinter {
    boolean isOddPrinted = false;

    synchronized void printOdd(int number) {
        while ((isOddPrinted)) { //if oddPrinted is true then wait for even number to print
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " " + number); //if oddPrinted is false then print next oddNumber and set
        // isOddPrinted=true and notify printEven
        isOddPrinted = true;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notify();
    }

    synchronized void printEven(int number) {
        while ((!isOddPrinted)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println(Thread.currentThread().getName()+ " "+number);
            isOddPrinted=false;
            try{Thread.sleep(1000);}
            catch (InterruptedException e){e.printStackTrace();}notify();
        }
    }

}
