package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
       // int result = (Math.abs(multiplyByAndToInclusive)) * (Math.abs(counter));
         int result = counter * multiplyByAndToInclusive;
        // result = Integer.signum(result);

        while (counter <= multiplyByAndToInclusive) {
            if(multiplyByAndToInclusive< 0) {
                System.out.println(result);
            }else if(multiplyByAndToInclusive> 0){
                System.out.println(result);
            }else{
                System.out.println("elena");
            }
            counter++;
        }
    }

    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.printMultiplied(5);
    }

    //Write a program that will write to console multiplied numbers by input from zero to the number
    //from method arguments using while loop,
    //each on new line(program should also be able to work with negatives):
}
