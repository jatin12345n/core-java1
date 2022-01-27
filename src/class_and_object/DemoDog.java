package class_and_object;

public class DemoDog {

          /* todo          Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
       */
    //capabilities
    // run , bark , eat , sleep

    // Syntax : access_specifier return_type  method_name (parameter) {CODE}

    public void run(){
        System.out.println("Inside run method,Dog is running......");

    }
    public void bark(){
        System.out.println("Inside bark method,Dog is barking......");

    }
    public void eat(){
        System.out.println("Inside eat method,Dog is eating........");

    }
    public void sleep(){
        System.out.println("Inside sleep method,Dog is sleeping........");
    }
        public static void main(String[] args) {
         //Step 1- create object step 2 calling
     // classname objName= new ClassName();
//step 1
         DemoDog obj= new DemoDog();
//step 2 : objName.methodName();
            obj.run();//Calling run method
      // Calling the methodName();
            obj.bark();//Calling run method
            //Calling the methodName();
            obj.eat();//Calling run method
      //Calling the methodName();
            obj.sleep();//Calling run method


    }

}
