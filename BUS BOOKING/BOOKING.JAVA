package TRAVEL;
import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class BOOKING {
	String name;
	int busno;
	Date date;
	BOOKING(Scanner io)
	{
		System.out.println("Enter Passenger name: ");
		name=io.next();
		System.out.println("Enter bus no: ");
		busno=io.nextInt();
		System.out.println("Enter date (dd-mm-yyyy): ");
		String n=io.next();
		
		SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
		try
		{
			date=sdf.parse(n);
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
	public boolean isavailable(ArrayList<BUS> buses, ArrayList<BOOKING> bookings)
	{
		int booked=0;
		int capacity=0;
		for(BUS b : buses) {
			if(b.get_bno() == busno) {
				capacity = b.get_capacity();
			}
		}
		for(BOOKING a : bookings)
		{
			if(a.busno == busno && a.date.equals(date)) 
			{
				booked++;
			}
		}
		return booked<capacity;
	}
	
}
