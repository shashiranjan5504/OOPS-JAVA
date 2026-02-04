class Demo6 {
    int x = 100;
    int y = 200;
}

class mainClass6 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        Demo6 d1 = new Demo6();
        Demo6 d2 = new Demo6();
        System.out.println("d1------->"+d1);
        System.out.println("d2------->" + d2);
        System.out.println("Modifying value of x and y of d1");
        d1.x = 300;
        d1.y = 400;
        System.out.println("printing x and y of d2 ");
        System.out.println(d2.x );
        System.out.println(d2.y);
        System.out.println("printing x and y of d1 ");
        System.out.println(d1.x );
        System.out.println(d1.y);
        System.out.println("Main method ended");
        

        

        
    }
}
