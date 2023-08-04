package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int fact = 1;
        int i = 0;
        while (i <= printToInclusive) {

            fact = fact * i;

            if (fact == 0) {
                fact = 1;
            }

            System.out.println(fact);  //+" " + "+"
            i++; //increment i by 1
        }

        if (printToInclusive == 0) {
            fact = 1;
            System.out.println(fact);
        }
    }

    public static void main(String[] args) {
        FactorialNumbers fb = new FactorialNumbers();
        fb.printFactorialRow(7);
    }

    //Write a program that will write to console all numbers from factorial row,
    // from 0 up to input from method arguments using while loop, each on new line:
}
