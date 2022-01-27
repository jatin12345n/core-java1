package conditional_statements;

public class IFandELSE1{
     public static void main(String[] args) {
    int age = 15;
    //SYNTEX : if(condition){ code to be executed } else {}
    if (age > 18) {

        System.out.println("person is young");

    } else {
        System.out.println("person is child");

    }
    int a = 1;
    int b = 11;
    if (a > b) {
        System.out.println("A is less then B");
    } else {
        System.out.println("A is not less then B");

    }
    String city = "AGRA";
    if (city == "AGRA") {
        System.out.println("you are in agra");
    } else {
        System.out.println("you are in not in agra");

    }
}
}
