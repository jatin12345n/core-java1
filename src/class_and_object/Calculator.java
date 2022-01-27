package class_and_object;

public class Calculator {

    // add , sub , mul and div


    public int add() {

        int a = 6;
        int b = 512;

        int result = a + b;
        //   System.out.println("Addititon is"+ result);
        return result;
    }

    public int sub(){

        int a = 5485;
        int b =55;

        int result2 = a - b;
        // System.out.println("sub is "+result);
        return result2;
    }
    public int mul () {

        int a = 13;
        int b = 13;

        int result3 = a * b;
        //   System.out.println("mul is"+ result3);
        return result3;
    }
    public int div () {

        int a = 50;
        int b = 2;

        int result4 = a/b;
        //   System.out.println("div is"+ result4);
        return result4;
    }
    public static void main(String[] args) {
        Calculator calculator= new Calculator();
        int result= calculator.add();

        System.out.println("add is "+ result);

        int result2= calculator.sub();

        System.out.println("sub is "+result2);

        int result3= calculator.mul();

        System.out.println("mul is "+result3);

        int result4= calculator.div();

        System.out.println("div is "+result4);
    }
}