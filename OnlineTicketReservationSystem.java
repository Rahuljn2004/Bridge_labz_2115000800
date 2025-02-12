class Ticket {
    int ticketId;
    String customerName, movieName, seatNumber, bookingTime;
    Ticket next;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}

class OnlineTicketReservationSystem {
    Ticket head, tail;

    public void addTicket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
    }

    public void removeTicket(int ticketId) {
        if (head == null) return;
        Ticket temp = head, prev = null;
        do {
            if (temp.ticketId == ticketId) {
                if (prev == null) { // Removing head
                    head = head.next;
                    tail.next = head;
                } else {
                    prev.next = temp.next;
                    if (temp == tail) tail = prev;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void displayTickets() {
        if (head == null) return;
        Ticket temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customerName + " " + temp.movieName + " " + temp.seatNumber + " " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        OnlineTicketReservationSystem otrs = new OnlineTicketReservationSystem();
        otrs.addTicket(1, "John", "Avengers", "A1", "10:00 AM");
        otrs.addTicket(2, "Emma", "Spiderman", "B2", "12:00 PM");
        otrs.displayTickets();
        otrs.removeTicket(1);
        otrs.displayTickets();
    }
}
