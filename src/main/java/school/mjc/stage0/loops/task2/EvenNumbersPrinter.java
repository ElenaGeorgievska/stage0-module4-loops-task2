package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int counter = 0;
        while(counter <= printTillInclusive){
            System.out.println(counter);
            counter += 2;
        }
    }

    public static void main(String[]args){
        EvenNumbersPrinter en = new EvenNumbersPrinter();
        en.printEvenNumbers(0);
    }

    //Write a program that will write to console even numbers from zero to the number
    // from method arguments using while loop, each on new line:
}
