// take the value from the user and initialize with the object with the user values   
import java.util.Scanner;

class Graphpoint {

    double xAxis;
    double yAxis;

    Graphpoint(double x, double y) {
        xAxis = x;
        yAxis = y;
    }

    void info() {
        System.out.println("(" + xAxis + "," + yAxis + ")");
    }
}

class MainClass5 {
    public static void main(String[] args) {
        System.out.println("main method started ");
        Scanner scn=new Scanner(System.in);
        System.out.println("enter the x co-ordinates ");
        double x=scn.nextDouble();
        System.out.println("enter the y co-ordinates ");
        double y=scn.nextDouble();


        Graphpoint g1 = new Graphpoint(x, y);

        g1.info();
    }
}
