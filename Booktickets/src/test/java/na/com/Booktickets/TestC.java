package na.com.Booktickets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestC {
	static Customer cust;
	private static Customer_Int dao;

	@BeforeEach
	public void setUp() {
		System.out.println("TestC.setUp()");
		dao = new Customer2();
		cust = new Customer(dao);
		System.out.println(cust.getClass());

	}

	@AfterEach
	public void dearDown() {
		System.out.println("TestC.dearDown()");
	}

	@Test
	public void testWithBooktickestSuccess() {
		System.out.println("TestC.testWithBooktickestSuccess()");
		int result = cust.bookticket("nethra", 8888, 2);
		assertEquals(1, result, "ticket_book");

	}

	@Test
	public void testWithBookticketNameException() {

		System.out.println("TestC.testWithBookticketsUnsuccess()");
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			cust.bookticket("", 9990, 2);
		});
		assertEquals("ticket not booking", e.getMessage());

	}

	@Test
	public void testWithNegativeNumber() {
		System.out.println("TestC.testWithNegativeNumber()");
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			cust.bookticket("ravi", -8888, 2);
		});
		assertEquals("ticket not booking", e.getMessage());

	}

	@Test
	public void testWithNegativeticket() {
		System.out.println("TestC.testWithNegativeticket()");
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			cust.bookticket("nethra", 88888, -2);

		});
		assertEquals("ticket not booking", e.getMessage());
	}

	@Test
	public void testWithWithoutInput() {

		System.out.println("TestC.testWithWithoutInput()");
		Exception e = assertThrows(IllegalArgumentException.class, () -> {
			cust.bookticket("", 0, 0);
		});
		assertEquals("ticket not booking", e.getMessage());
	}

	@Test
	public void testBookTcketNotAvailabel() {
		System.out.println("TestC.testBookTcketNotAvailabel()");
		dao = new Customer2() {
			@Override

			public int bookticket(String name, long phNo, int ticket) {
				return 0;
			}

		};
		cust = new Customer(dao);
		int result = cust.bookticket("ravi", 555, 2);
		assertEquals(0, result, "Ticket book should faild not ticket available");

	}
}
