package scanner;

import java.util.Scanner;

public class ExerciseOddEven {

    public static void main(String[] args) {


        Scanner obj = new Scanner(System.in);  // create object of scanner class
        System.out.println("please enter number");

        int number = obj.nextInt();

        if (number % 2 == 0) {
            System.out.println("Number is even number " + number);
        } else {
            System.out.println("Number is odd number " + number);
        }
    }
}