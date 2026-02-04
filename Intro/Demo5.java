
//this program is to creating only one object and printing value of x and y

class Demo5 {
    int x = 10;//non-static member variable 

    int y = 20;//non-static member variable

}

class mainClass5 {
    public static void main() {
        System.out.println("Main Method started");
        Demo5 d1;//decalring reference variable
        d1 = new Demo5();//assigning object to reference variable 
        //storing object address into reference  variable 

        System.out.println(d1);//address of object d1


        System.out.println("x value is "+d1.x);//10
        System.out.println("y value is " + d1.y);//20
        
        System.out.println("Main method ended ");
        


      
    }
}
