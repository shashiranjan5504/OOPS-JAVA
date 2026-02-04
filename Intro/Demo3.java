class Demo3 {
    static void test() {
        System.out.println("running test() method..");
        int a = 10;//local variable

    }

    static void disp() {
        System.out.println("running disp() method...");
    }
}

class mainClass3 {
    //main method
    public static void main(String[] args) {
        System.out.println("main method is running ");
       // Demo3.test();
       //Demo3.disp();
        Demo1.x = 300;
        Demo1.y = 400;
        System.out.println(Demo1.x);
        System.out.println(Demo1.y);
        // System.out.println(Demo2.x);
        // System.out.println(Demo2.y);
        System.out.println("main method ends");

    }
}
