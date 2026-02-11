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
        Demo3.test();
        Demo3.disp();
       
        System.out.println(Demo1.x);
        System.out.println(Demo1.y);

        //here a copy of demo1 classs will come not the exact value so the  modification done in class2 is not visible in this class,the original value will print where  this variable define 
        System.out.println(Demo2.x);
        System.out.println(Demo2.y);
        //here a copy of demo2 classs will come not the exact value so the  modification done in class2 is not visible in this class,the original value will print where  this variable define

        System.out.println("main method ends");

    }
}
