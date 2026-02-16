class UseOfThisKeyword {
    //instance variable 
    int x = 100;

    //instance method
    void display() {
        int x = 200;
        System.out.println("value of  local variable x is " + x);
        // if the variablename is same of local variable and instance variable and we are printing the value inside a method the preference will go to local variable 
        System.out.println("value of instance variable x is "+this.x);//this keyword remove conflict by it is used for denoting instance variable 
     }
}

class MainClass7 {
    public static void main(String[] args) {
        System.out.println("main method started");
        UseOfThisKeyword u1 = new UseOfThisKeyword();
        u1.display();
        System.out.println("main method ended");

    }
}
