package conditional_statements;

public class IFandELSE3 {
    public static void main(String[] args) {
        int a = 1;
        int b =-5;

        if (a > 0 && b > 0) {
            System.out.println(" AND a and b are greater then zero");
        } else {
            System.out.println(" AND a and b are not greater then zero");
        }
        if(a>0 || b>0){
            System.out.println("OR a and b are greater then zero");
        } else {
            System.out.println("OR a and b are not greater then zero");
        }

    }

}
