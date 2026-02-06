class Demo8 {
    int x = 100;
    int y = 200;

}
class mainClass8{
        public static void main(String[] args) {
            System.out.println("main method started ");
            Demo8 d1 = new Demo8();//assigning a object to d1 reference variable 
            System.out.println("d1-----------> " + d1);
            System.out.println("modifying  x and y  of d1");
            d1.x = 300;
            d1.y = 400;
            System.out.println("printing x and  y  of d1");
            System.out.println(d1.x);
            System.out.println(d1.y);
            System.out.println("---------------------------------------");
            d1 = new Demo8();//re-assigning  another  object to d1 reference variable i.e is basically reintialization of reference variable and it is valid 
            System.out.println("d1-----------> " + d1);
            System.out.println("printing x and  y  of d1");

            System.out.println(d1.x);
            System.out.println(d1.y);
            System.out.println("main method ended");

            Demo8 d2 = null;

            //example of null pointer exception it is   run time error  
            System.out.println(d2.x);




            


            

        }
    
}
