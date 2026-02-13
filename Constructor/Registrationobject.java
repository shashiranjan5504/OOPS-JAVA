import java.util.Scanner;

class Registration {

    //instance variables or states or fields or data members

    String username;
    String email;
    long phoneNumber;
    String password;


    //calling user defined paramaterized parameter
    Registration(String u, String e, long p, String pass) {
        System.out.println("-----------Username Details------------- ");
        username = u;
        email = e;
        phoneNumber = p;
        password = pass;

    }

    void info() {
        System.out.println("Username is "+username);
        System.out.println("Email is "+email);
        System.out.println("Phone Number is "+phoneNumber);
        System.out.println("Password is "+password);


    }
}

class Mainclass3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the username ");
        String u = scan.next();
        System.out.println("enter the email ");
        String e = scan.next();
        System.out.println("enter the phone number  ");
        long p = scan.nextLong();
        System.out.println("enter the password ");
        String pass = scan.next();

        Registration r1 = new Registration(u, e, p, pass);
        
        r1.info();

    }
}

    


    
    

