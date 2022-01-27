package loops;

public class NewAssignment {
    public static void main(String[] args) {
        // print table of two   2*1 2*2 2*3 ..... 2*10

        for (int i=1; i<11; i++){
            int two=2;
            int result=two*i;
            System.out.println("table of two is :" +result);
        }
        // print table of five   7*1 7*2 7*3 ..... 7*10
            for (int i=1; i<11; i++){
                int seven=7;
                int result=seven*i;
                System.out.println("table of seven is :" +result);
            }


    }
}
