import java.util.GregorianCalendar;

public class Driver {
	public static void main(String[] args) {
		Entry e = new Entry("Bibimbop", "was tasty", 16, 2018, 6, 21);
		
		GregorianCalendar t2 = new GregorianCalendar(2018, 7, 21);
		System.out.println("Bibimbop: " + e.getName());
		System.out.println("was tasty: " + e.getNotes());
		System.out.println("16: " + e.getCost());
		System.out.println(": " + e.getDate().getTime());
		System.out.println(e.compareTo(t2));
	}
}
