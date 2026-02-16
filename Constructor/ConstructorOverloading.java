class ConstructorOverloading {
    //instance variable 
    int x;
    double y;

    //constructor overloaded
     
    ConstructorOverloading() {
        System.out.println("running  constructor with no parameter");
        x = 10;
        y = 2.5;
    }
    //2.constructor with one int parameter 
    ConstructorOverloading(int arg) {
        System.out.println("running  constructor with only int  parameter");
        x = arg;//here 
    }
    //3.co
    ConstructorOverloading(double arg) {
        System.out.println("running  constructor with only double  parameter");
        y = arg;
    }

    ConstructorOverloading(int arg1, double arg2) {
        System.out.println("running  constructor with  int and double parameter");
        x = arg1;
        y = arg2;
    }

    ConstructorOverloading(double arg1, int arg2) {
        System.out.println("running  constructor with double and int  parameter");
        x = arg2;
        y = arg1;
    }
    //instance method 
    void details() {
        System.out.println("x value is : " + x + "  and  y value is : " + y);
        System.out.println("----------------------------------");

    }
}

class MainClass6 {
    public static void main(String[] args) {
        System.out.println("main method started ");

        ConstructorOverloading c1 = new ConstructorOverloading();
        c1.details();
        
        ConstructorOverloading c2 = new ConstructorOverloading(12);
        c2.details();
        
        ConstructorOverloading c3 = new ConstructorOverloading(2.5);
        c3.details();
        
        ConstructorOverloading c4 = new ConstructorOverloading(26,7.8);
        c4.details();
        
        ConstructorOverloading c5 = new ConstructorOverloading(5.25,78);
        c5.details();
        System.out.println("main method ended ");
    }
}
