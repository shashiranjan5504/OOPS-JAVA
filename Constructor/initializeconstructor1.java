
// in this code we just create user defined non parametarized constructor which is called whenever object is created by new operator during object creation timing



class Demo2 {


    //instance variable 
    int x;
    double y;

    Demo2() {
        System.out.println("Running Demo2 class constructor");
        x = 10;
        y = 4.5;
    } 
}

class MainClass2 {
    public static void main(String[] args) {
        System.out.println("Main method started");
        //object creation and storing the object creation address in the reference variable

        Demo2 d1 = new Demo2();
        System.out.println("After object created,constructor will called");
        
        System.out.println(d1.x);
        System.out.println(d1.y);
        


        System.out.println("Main method started");
      

        
    }
}
