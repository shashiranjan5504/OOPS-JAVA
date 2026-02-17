class SavingAccount {
    final String accnum;
    double accbal;
    String custname;
    static int randnum = 10001;//if we remove the static keyword each randnum is created for each object then after initializing each  object start from same number

    final static String prefix="SBI";
    //for alphanumeric auto generated account number 
    SavingAccount( double b, String n) {
        accnum = prefix + randnum++;  // or accnum = randnum++ for auto generated numeric character  
        accbal = b;
        custname = n;
    }

    void details() {
        System.out.println("Account Number:" + accnum + " Balance :" + accbal + " Name  : " + custname);
    }
}

class MainClass9 {
    public static void main(String[] args) {
        System.out.println("main method started");
        SavingAccount sav1 = new SavingAccount( 25000.00, "Ramesh");
        sav1.details();
        
        SavingAccount sav2= new SavingAccount( 20000.00, "Suresh");
        sav2.details();
        SavingAccount sav3 = new SavingAccount( 30000.00, "Mukesh");
        sav3.details();
        System.out.println("main method ended");

    }
}

