
//in this we dont create any user defined constructor so defaut constructor will be called and the value intializes with default value in java 

class Demo3 {
    //instance variable 
    int x;
    double y;

     
}

class MainClass3 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        //object creation and storing the object creation address in the reference variable

        Demo3 d1 = new Demo3();
        System.out.println("After object created, default constructor will called");
        
        System.out.println(d1.x);
        System.out.println(d1.y);
        //the values will get intialized with zero


        System.out.println("Main method started");
      

        
    }
}

