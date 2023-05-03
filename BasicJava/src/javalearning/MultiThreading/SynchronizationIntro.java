package javalearning.MultiThreading;

public class SynchronizationIntro {

	public static void main(String[] args) {
		TicketCounterPortal ticketCounterPortal = new TicketCounterPortal();
		TicketBooking t1 = new TicketBooking(ticketCounterPortal, "user1",4);
		TicketBooking t2 = new TicketBooking(ticketCounterPortal, "user2",4);
        
		t1.start();
		t2.start();
	}

}
