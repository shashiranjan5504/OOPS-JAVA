class Circle {
    double radius;
    final static double pi = 3.14;

    void diameter() {
        double diameter = 2 * radius;
        System.out.println("Diameter :" + diameter);
    }

    void area() {
        double area = pi * radius * radius;
        System.out.println("Area :" + area);

    }

    void circumference() {
        double circumference = 2 * pi * radius;
        System.out.println("Circumference :" + circumference);
    }
}
 
class MainClass10 {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        Circle c1 = new Circle();
        c1.radius = 2.1;
        System.out.println("Radius :" + c1.radius);
        c1.diameter();
        c1.area();
        c1.circumference();
        System.out.println("-------------------");
        Circle c2 = new Circle();
        c2.radius = 3.1;
        System.out.println("Radius :" + c2.radius);
        c2.diameter();
        c2.area();
        c2.circumference();
         System.out.println("-------------------");
        Circle c3 = new Circle();
        c3.radius = 2.1;
        System.out.println("Radius :" + c3.radius);
        c3.diameter();
        c3.area();
        c3.circumference();
        System.out.println("Main Method Ended");

        
        

        
    }
}
