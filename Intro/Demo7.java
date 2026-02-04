
//program to display that two  different  reference variable refer to a single object  and if one reference variable  modify something it will be also create impact on second reference variable also
class Demo7 {
    int x = 100;
    int y = 200;

}

class mainClass7 {
    public static void main(String[] args) {
        System.out.println("main method started ");
        Demo7 d1 = new Demo7();
        Demo7 d2 = d1;
        System.out.println("d1-------> "+d1);
        System.out.println("d2--------> "+d2);
        System.out.println(" modifying  value of x and y of d1");

        d1.x = 300;
        d1.y = 400;
        System.out.println(" printing x and y value of d2   ");
        System.out.println(d2.x);
        System.out.println(d2.y);
        System.out.println(" printing x and y value of d1   ");
        System.out.println(d1.x);
        System.out.println(d1.y);
        System.out.println("main method ended ");

    }

    
}
