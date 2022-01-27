package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {

        //SYNTAX: ClassName objName= new ClassName();

        Scanner obj= new Scanner(System.in);  // create object of scanner class
        System.out.println("please enter your name  :  ");

        String name = obj.nextLine();// Reads  String input

        System.out.println("you have enter :  " +name);

        System.out.println("Please enter your age:");
        int age=obj.nextInt(); // reads integer value

        System.out.println("you have entered age as :" +age);

        System.out.println("Please Enter your salary");
        double salary = obj.nextDouble();
        System.out.println("You have entered salary as : " + salary);





    }
}
