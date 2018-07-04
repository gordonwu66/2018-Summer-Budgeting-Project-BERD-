import static org.junit.jupiter.api.Assertions.*;
import java.util.GregorianCalendar;

class Test {

	@org.junit.jupiter.api.Test
	void testEntryMethods() {
		//Creates a entry with the name "Books", notes "Organic Chemistry", "price 100, and created on July 4, 2018
		Entry e1 = new Entry("Books", "Organic Chemistry", 100, 2018, 6, 4);
		GregorianCalendar g1 = new GregorianCalendar(2018, 6, 4);
		GregorianCalendar newDate = new GregorianCalendar(2018, 7, 4);
		GregorianCalendar beforePurchase = new GregorianCalendar(2000, 0 , 1);
		GregorianCalendar afterPurchase = new GregorianCalendar(2030, 0 , 1);

		//getName
		assertEquals("Books", e1.getName());

		//getNotes
		assertEquals("Organic Chemistry", e1.getNotes());

		//getCost
		assertEquals(100, e1.getCost());

		//getDate
		assertEquals(g1,e1.getDate());

		//getCategory
		assertEquals(null, e1.getCategory());

		//compareTo
		assertEquals(e1.getDate().compareTo(g1), 0); //equal
		assertEquals(e1.getDate().compareTo(beforePurchase), 1); //greater
		assertEquals(e1.getDate().compareTo(afterPurchase), -1); //less than


		//setName
		e1.setName("Food");
		assertEquals("Food", e1.getName());

		//setNotes
		e1.setNotes("Apples");
		assertEquals("Apples", e1.getNotes());

		//setCost
		e1.setCost(5);
		assertEquals(5, e1.getCost());

		//setDate  (August 4, 2018)
		e1.setDate(2018, 7, 4);
		assertEquals(e1.getDate().compareTo(newDate), 0);
		assertEquals(e1.getDate().compareTo(beforePurchase), 1);
		assertEquals(e1.getDate().compareTo(afterPurchase), -1);

		//setCategory
		Category c1 = new Category("Necessary Expenses");
		e1.setCategory(c1);
		assertEquals(e1.getCategory(), c1);
		assertEquals(e1.getCategory().getName(), "Necessary Expenses");
	}

	@org.junit.jupiter.api.Test
	void testCategoryMethods() {


	}
	
	@org.junit.jupiter.api.Test
	void testSpreadsheetMethods() {


	}
	
	@org.junit.jupiter.api.Test
	void testCoordinateMethods() {


	}
	
	@org.junit.jupiter.api.Test
	void testHistoryMethods() {


	}
	
	@org.junit.jupiter.api.Test
	void testLineMethods() {


	}
	
	@org.junit.jupiter.api.Test
	void testPieMethods() {


	}

	@org.junit.jupiter.api.Test
	void testPieVariableMethods() {


	}
}
