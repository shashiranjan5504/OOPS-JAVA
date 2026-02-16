import java.util.Scanner;
class TestUserRegistration {
    public static void main(String[] args) {
        System.out.println("main method started ");


        System.out.println("Enter 1 or  2 or 3  \n");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("enter the value of  usernsame ");
                String username = scan.next();
                System.out.println("enter the value of  emailid  ");
                String emailId = scan.next();
                System.out.println("enter the value of  phone num ");
                long phonenum = scan.nextLong();
                System.out.println("enter the value of  password ");
                String password  = scan.next();
                UserRegistration user1 = new UserRegistration(username , emailId, phonenum, password);
                 user1.details();
                
                break;
            case 2:
                 System.out.println("enter the value of  usernsame ");
                String username1 = scan.next();
                System.out.println("enter the value of  emailid  ");
                String emailId2 = scan.next();
                
                 System.out.println("enter the value of  password ");
                String password2 = scan.next();
                 UserRegistration user2 = new UserRegistration(username1, emailId2, password2);
                 user2.details();
                 break;
             case 3:
                    System.out.println("enter the value of  usernsame ");
                    String username3 = scan.next();
                    System.out.println("enter the value of  phonenumber ");
                   
                    long  phonenum3 = scan.nextLong();
                    System.out.println("enter the value of  password ");
                    String password3 = scan.next();
                    UserRegistration user3 = new UserRegistration(username3, phonenum3, password3);
                    user3.details();
                    break;
                
        
            default:
                System.out.println("your input is incorrect");
        }

        
        

       
      

        System.out.println("main method ended");

    }
}
//to run this program there is two option 
//1.  compile the other classes separately which is used in this class and then compile this classs also then run the  main method
//2. directly compile and run  this  class which is containing the main method ,so it will automatically compile other classes as the classes name comes to jvm.then no need to compile other classes. 

