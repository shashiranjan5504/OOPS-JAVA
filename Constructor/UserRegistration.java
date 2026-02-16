
// this is the example of constructor overloading  and use of this keyword 

class UserRegistration {
    //instance variable 
    String username;
    String emailId;
    long phonenum;
    String password;

    // contructor overloaded  
    public UserRegistration(String username, String emailId, long phonenum, String password) {
        this.username = username;
        this.emailId = emailId;
        this.phonenum = phonenum;
        this.password = password;
    }
    //user defined with four parameter 

    public UserRegistration(String username, String emailId, String password) {
        this.username = username;
        this.emailId = emailId;
        this.password = password;
    }
    public UserRegistration(String username, long phonenum, String password) {
        this.username = username;
        this.phonenum = phonenum;
        this.password = password;
    }

    void details() {
        System.out.println("Username : " + username + "\nEmail ID : " + emailId + "\nPhone : " + phonenum
                + "\nPassword : " + password);
        System.out.println("---------------------------------------------------");
    }
    
}
