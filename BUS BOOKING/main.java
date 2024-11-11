package TRAVEL;

import java.util.*;

public class MASTER {
	public static void main(String[] args) {
		ArrayList<BUS> buses = new ArrayList<>();
		ArrayList<BOOKING> bookings = new ArrayList<>();
		buses.add(new BUS(1,true,3));
		buses.add(new BUS(2,true,4));
		buses.add(new BUS(3,true,2));
		for(BUS b : buses)
		{
			b.display();
		}
		Scanner io = new Scanner(System.in);
		int c = 1;
		while(c == 1) 
		{
			System.out.println("Enter 1 to book, 2 to display, 3 to exit");
			c=io.nextInt();
			if(c==1) 
			{
				BOOKING book = new BOOKING(io);
				if(book.isavailable(buses, bookings))
				{
					
					System.out.println("Confirmed your booking");
					bookings.add(book);
				}
				else
				{
					System.out.println("Sorry.. Seats are filled. try another bus");
				}
			}
			 else if(c==2) {
   			  int count=0;
   			  for(BUS t: buses) {
   			  for(BOOKING f: bookings) {
   				  if (f.busno == t.get_bno()) {
                         count++;
                     }
   			  }
   			  System.out.println("Bus No: " + t.get_bno() + ", Bookings: " + count +", Vacant: "+(t.get_capacity()-count));
   				 count=0; 
   			  }
   		  }
   	  }
		io.close();
		
	}
}
