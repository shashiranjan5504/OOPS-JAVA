
//represent ticketcounter as an object, ticketcounter has no of tickets to be sold ,buyticket is an operation to buy N tickets and cancelticket is an operation to cancel N tickets. viewAvailableTickets operation is used to print current available tickets


class TicketCounter {

    int totalTickets;
    int ticketCounterNum;
    double ticketPrice;

    void buyticket(int tickets) {
        System.out.println("No.of tickets buy :  " + tickets);
        if (tickets < totalTickets) {
            totalTickets = totalTickets - tickets;

        } else {
            System.out.println("Not available tickets");
        }
    }

    void cancelticket(int tickets) {
        System.out.println("No.of tickets cancel :" + tickets);
        totalTickets = totalTickets + tickets;
    }

    void viewAvailableTickets() {
        System.out.println("Number of  available tickets :" + totalTickets);
    }
}

class MainClass12 {
    public static void main(String[] args) {
        TicketCounter t1 = new TicketCounter();
        t1.totalTickets = 100;
        t1.ticketCounterNum = 01;
        t1.viewAvailableTickets();

        t1.buyticket(52);
        t1.viewAvailableTickets();

        t1.cancelticket(25);
        t1.viewAvailableTickets();
    }
} 
