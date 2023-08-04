package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int counter = 0;
        while (counter <= lastPrinted) {
            System.out.println(counter);
            counter++;
        }
    }

    public static void main(String[] args) {
        NaturalNumbers nn = new NaturalNumbers();
        nn.naturalNumbersPrinter(9);
    }
    //Write a program that will write to console numbers from zero to the number
    // from method arguments using while loop, each on new line:
}
