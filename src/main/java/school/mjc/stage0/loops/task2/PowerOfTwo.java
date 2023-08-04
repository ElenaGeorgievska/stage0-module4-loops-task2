package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i =0;
        while(i<=power){
            int result = (int) Math.pow(2,i);
            System.out.println(result);
            i++;
        }

        if(power<0){
            System.out.println("too much power");
        }
    }

    public static void main(String[]args){
        PowerOfTwo pow = new PowerOfTwo();
        pow.printPower(-9);
    }

    //Write a program that will take int power as an argument.
    // This argument will be used to calculate power of 2.
    // The program should write to console each value for power of 2 beginning from 2^0...2^power.
    // Write the program using "while" in case of negative value print "too much power":
}
