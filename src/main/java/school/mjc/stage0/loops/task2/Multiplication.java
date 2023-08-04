package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int i = 0;

        while (i <= Math.abs(multiplyByAndToInclusive)) {

            int result = i * multiplyByAndToInclusive;

            if (multiplyByAndToInclusive == 0) {
                System.out.println();
            }

            if (multiplyByAndToInclusive < 0) {
                System.out.println(result);
            }

            if (multiplyByAndToInclusive > 0) {
                System.out.println(result);
            }

            i++;
        }


    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(0);
    }

    //Write a program that will write to console multiplied numbers by input from zero to the number
    //from method arguments using while loop,
    //each on new line(program should also be able to work with negatives):
}
