package class_and_object;

import java.util.Scanner;

public class CalculatorApp {

    public int Addition (int a, int b){

        int result=a+b;

        return result;
    }
    public int Subtraction (int a, int b){

        int result=a-b;

        return result;
    }

    public int Multiplication (int a, int b){

        int result=a*b;

        return result;
    }
    public int Dividation (int a, int b){

        int result=a/b;

        return result;
    }
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); //Create a Scanner Object

        System.out.println("Please Enter Your Choice : 1-Addition, 2- Subtraction, 3-Multiplication, 4-Dividation");

        int choice= myObj.nextInt();

        System.out.println("Please enter value of first input number a: ");
        int a=myObj.nextInt();
        System.out.println("Please enter value of first input number b: ");
        int b=myObj.nextInt();

        CalculatorApp obj=new CalculatorApp();
        int output=0;


        if (choice==1){

            // Call Addition

            output=obj.Addition(a,b);
        }
        else if (choice==2){

            // Call Subtraction

            output=obj.Subtraction(a,b);
        }
        else if (choice==3){

            // Call Multiplication

           output=obj.Multiplication(a,b);
        }
        else {
            // Call Dividation

            output=obj.Dividation(a,b);
        }

        System.out.println("result of given input is "+ output );

    }
}
