package Arrays;

public class ArraysDemo {

    public void Demointarray () {
        // SYNTAX of Array : DataType  []  variable_name={,,,};

        int[] marksArray = {44, 55, 33, 87, 98, 67, 78, 32, 41};

        //index 0,1,2,3,4,5,

        System.out.println(marksArray[0]);
        System.out.println(marksArray[1]);
        System.out.println(marksArray[2]);
        System.out.println(marksArray[3]);
        System.out.println(marksArray[4]);
        System.out.println(marksArray[5]);
        System.out.println(marksArray[6]);
        System.out.println(marksArray[7]);
        System.out.println(marksArray[8]);


        for (int i = 0; i < marksArray.length; i++) {

            System.out.println(" Inside for Loop " + marksArray[i]);

        }
        //Advance for Loop
        //SYNTAX : for (DataType var_name : arrays){
        // }

        for (int var : marksArray) {

            System.out.println("Inside Advance for Loop " + var);
        }
    }
        public void DemoStringArray() {
            //SYNTAX of Array : DataType []  variable_name{,,,};

            String[] nameArray= {"Java","Java8","Spring","Spring Boot","Cloud"};
            for(String var: nameArray) {

                System.out.println("Inside Advance for Loop Name Array : "+var);

            }
        }
        //Double Salary

        public void DemodoubleArray(){

            //SYNTEX of Array : DataType [] variable_Salary{,,,}

        double [] SalaryArray = {22000,65000,55000,45875,457859,457822,1545545};

        // index 0,1,2,3,4,5,

            System.out.println(SalaryArray[0]);
            System.out.println(SalaryArray[1]);
            System.out.println(SalaryArray[2]);
            System.out.println(SalaryArray[3]);
            System.out.println(SalaryArray[4]);
            System.out.println(SalaryArray[5]);
            System.out.println(SalaryArray[6]);

            for (int i = 0; i <SalaryArray.length; i++) {

                System.out.println(" Inside for Loop " + SalaryArray[i]);

            }
            //Advance for Loop
            //SYNTAX : for (DataType var_name : arrays){
            // }
            for (double var : SalaryArray) {

                System.out.println("Inside Advance for Loop " + var);
            }


        }
           public void SalaryNameArray() {
        //SYNTAX of Array : DataType []  variable_Salary{,,,};

        String[] SalaryNameArray= {"22000 jatin","52000 mohit","48799 j&m","45800 jk","15458 mk"};
        for(String var: SalaryNameArray) {

            System.out.println("Inside Advance for Loop Salary Name Array : "+var);

        }
    }

        public static void main(String[] args) {

        ArraysDemo obj = new ArraysDemo();
        obj.Demointarray();
        obj.DemoStringArray();
        obj.DemodoubleArray();
        obj.SalaryNameArray();

    }

}

