/* write a code to represent following as object alongwith their attribute and possible behaviours 
1.Employee
2.Product 
3.UserAccount
4.BankAccount
5.GPSLocation */


class Employee {

    int employeeId;
    String employeeName;
    double employeeSalary;

    void info() {
        System.out.println("employee id :" + employeeId);
        System.out.println("employee name  " + employeeName);
        System.out.println("employee salary: " + employeeSalary);
    }

}

class Product {
    int productId;
    String productName;
    double price;

    void details() {
        System.out.println("product id :" + productId);
        System.out.println("product  name  " + productName);
        System.out.println("product salary: " + price);
    }
}

class UserAccount {
    String username;
    String password;
    String mailid;

    void info() {
        System.out.println("username  :" + username);
        System.out.println("password  " + password);
        System.out.println("mailid : " + mailid);

    }
}

class BankAccount {
    int Accnumber;
    String Name;
    double Accbalance;

    void details() {
        System.out.println("username  :" + Accnumber);
        System.out.println("password  " + Name);
        System.out.println("mailid : " + Accbalance);
    }
}

class GPSLocation {
    double latitude;
    double longitude;
    double altitude;
    String direction;

    
}

