package na.com.Booktickets;

public class Main {
	public static void main(String args[]) {

		Customer_Int c = new Customer2();

		Customer c1 = new Customer(c);

		try {
			int result =c1.bookticket("nethra ", 8888, 1);
			if(result ==1)
				System.out.println("ticket_Booked");
			else
				System.out.println("Ticket Sold Out ");
		} catch (Exception e) {
			e.getMessage();
		}
	}
}