class Demo2 {
    //instance variable 
    int x;
    double y;

    /* Demo2() {
        System.out.println("Running Demo2 class constructor");
        x = 10;
        y = 4.5;
    } */
}

class MainClass2 {
    public static void main(String[] args) {
        System.out.println("Main method started");

        System.out.println("Before calling constructor");
        //System.out.println();
        Demo2 d1 = new Demo2();
        System.out.println(d1.x);
        System.out.println(d1.y);
        


        System.out.println("Main method started");
      

        
    }
}
