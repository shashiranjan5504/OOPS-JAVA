class Demo1 {

    //static member  variable 
    static int x = 100;
    static int y = 200;

}

class mainClass1 {
    //main method
    public static void main(String[] args) {
        System.out.println("Main method started ");
        //printing static variable  of demoo1 class
        System.out.println("x value is " + Demo1.x);
        System.out.println("y value is " + Demo1.y);
        System.out.println("Main method  ended " );
    }
}
