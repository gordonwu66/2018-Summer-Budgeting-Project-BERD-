import java.util.GregorianCalendar;

/*
 * Stores data points in two variables, date and money spent, based on total
 * amount of money spent on each date
 */

public class Coordinate {
	private GregorianCalendar date;
	private int dollars;
	
	// basic constructor
	public Coordinate(GregorianCalendar dateIn, int dollarsIn) {
		date = dateIn;
		dollars = dollarsIn;
	}
	
	// constructor for no entries on a date, and therefore nothing spent
	public Coordinate(GregorianCalendar dateIn) {
		date = dateIn;
		dollars = 0;
	}
	
	public void setDate(GregorianCalendar dateIn) {
		date = dateIn;
	}

	public void setDollars(int dollarsIn) {
		dollars = dollarsIn;
	}
	
	public GregorianCalendar getDate() {
		return date;
	}
	
	public int getDollars() {
		return dollars;
	}
}
