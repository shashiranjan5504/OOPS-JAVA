/* //write a program to write a pen as a object in java language  alongwith its atrributes and behaviours

1.identify entity
2.identify attruibute 
3.identify behaviour  
4.define class 
-use insatnce variables for attributes 
-use instance methods for behaviours  
 */

class Pen {
    
    String brand;
    double price;
    String color;

    void details()
    {
        System.out.println("Brand :" + brand + " price :" + price + " color :" + color);
    }
}

class penMain {
    public static void main(String[] args) {
        Pen p1;
        p1 = new Pen();
        p1.brand = "Cello";
        p1.price  = 25.00;
        p1.color = "Black";
        p1.details();
        Pen p2 = new Pen();
        p2.brand = "Reynolds";
        p2.price = 30.00;
        p2.color = "Blue";
        p2.details();


    }
}