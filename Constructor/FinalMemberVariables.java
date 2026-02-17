class FinalMemberVariables {
    final int x=100;
    final static int y=200;

    void details( ) {
        System.out.println("x value is " + x);

         

        System.out.println("y value is " + y);
        
    }
}

class MainClass8 {
    public static void main(String[] args) {
        FinalMemberVariables d1 = new FinalMemberVariables();
        d1.details();

    }
}
