package na.com.Booktickets;

public class Customer implements Customer_Int {
	private Customer_Int custT;

	public Customer(Customer_Int custT) {
		this.custT = custT;
	}
@Override
	public int bookticket(String name, long phNo, int ticket) {

		if (name.equalsIgnoreCase("") || phNo<0 || ticket<0) {
			throw new  IllegalArgumentException("ticket not booking");
		}
	int count = custT.bookticket(name, phNo, ticket);
	if(count >0) 
		return 1;
	else 
		return 0;
	

	}

}
