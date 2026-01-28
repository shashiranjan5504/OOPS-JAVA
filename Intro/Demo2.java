class Demo2 {

    //static member  variable 
    static int x = 100;
    static int y = 200;

}

class mainClass2 {
    //main method
    public static void main(String[] args) {
        System.out.println("Main method started ");
        //printing static variable  of demo2 class
        System.out.println("x value is " + Demo2.x);
        System.out.println("y value is " + Demo2.y);
        System.out.println("Modifying static variables");
        //reintialization of static variable 

        Demo2.x = 300;
        Demo2.y = 400;
        //printing static variable after modification
         System.out.println("x value is " + Demo2.x);
         System.out.println("y value is " + Demo2.y);

         Demo1.x = 500;
         Demo1.y = 1000;

           System.out.println("x value is " + Demo1.x);
         System.out.println("y value is " + Demo1.y);

        
        
        System.out.println("Main method  ended " );
    }
}

