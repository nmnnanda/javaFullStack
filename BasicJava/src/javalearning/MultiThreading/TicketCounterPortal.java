package javalearning.MultiThreading;

public class TicketCounterPortal {
   private int totalAvailableSeats = 5;
   
   public synchronized void bookTicket(String passengerName,int seatsRequired){
	   if((totalAvailableSeats>=seatsRequired) && (seatsRequired>0)){
		   System.out.println("Hello Mr./Mrs./Miss - "+passengerName+".Seats booked successfully "+seatsRequired);
		   totalAvailableSeats -=seatsRequired;
	   }else{
		   System.out.println("Hello Mr./Mrs./Miss - "+passengerName+" .Unable to book ticket");
	   }
   }
}
