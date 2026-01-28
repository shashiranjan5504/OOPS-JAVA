class Demo3 {
    static void test() {
        System.out.println("running test() method..");
        int a = 10;//loacl variable

    }

    static void disp() {
        System.out.println("running disp() method...");
    }
}

class mainClass3 {
    //main method
    static public void main(String[] args) {
        System.out.println("main method is running ");
        Demo3.test();
        Demo3.disp();
        System.out.println("main method ends");

    }
}
