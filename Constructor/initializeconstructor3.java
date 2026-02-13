class Demo3 {
    //instance variable 
    int x;
    double y;

    // user defined parameterized constructor

    Demo3(int arg1, double arg2) {
        
        //x=10;
        //y=4.5;
        //this approach directly intialize with value is hard code it is not recommended in it industry

        x = arg1;
        y = arg2;
        
    }
}

class MainClass4 {
    public static void main(String[] args) {

        System.out.println("main method started");

        Demo3 d1 = new Demo3(12, 4.5);

        System.out.println("X value is "+d1.x);
        System.out.println("Y value is " + d1.y);

        //creating 2nd object 
        Demo3 d2 = new Demo3(25, 6.7);

        System.out.println("X value is "+d2.x);
        System.out.println("Y value is " + d2.y);
        
        System.out.println("main method ended");

        

        
    }
}
