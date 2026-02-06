class Account {
    double accBal;
    int accNum;

    void deposit(double amount) {
        System.out.println("Depositing Rs" + amount);
        accBal = accBal + amount;

    }

    void withdrawal(double amount) {
        System.out.println("withdraw Rs " + amount);
        if (amount < accBal) {
            accBal = accBal - amount;
            System.out.println("withdraw Success ");

        } else {
            System.out.println("withdraw unsuccessful ,due to insufficient balance ");

        }
    }

    void viewBalance() {
        System.out.println("Balance :" + accBal);

    }
}

class MainClass11{

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.accBal = 20000.00;
        a1.accNum = 21216156;
        a1.viewBalance();
        a1.deposit(5000);
        a1.viewBalance();
        a1.withdrawal(30000);
        a1.viewBalance();

    }
}
