
//this code show that whenever a object is created the constuctor will called by new operator at object creation time 
class Demo1 {

    Demo1() {
        System.out.println("Running Demo1 class constructor");
    }
}

class MainClass1 {
    public static void main(String[] args) {
        System.out.println("Main method started ");
        new Demo1();
        new Demo1();
        for (int i = 0; i < 25; i++) {
            new Demo1();
        }
        System.out.println("Main method ended ");

    }
}

//so the summary is the constructor is called as many times as many times the object is created
