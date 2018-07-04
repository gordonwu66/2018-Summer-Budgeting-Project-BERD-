import java.util.GregorianCalendar;

public class Entry {
	private String name, notes;
	private int cost;
	private GregorianCalendar cal;
	private Category categoryToBelongIn;
	
	public Entry(String name, String notes, int cost, int year, int month, int day) {
		this.name = name;
		this.notes = notes;
		this.cost = cost;
		cal = new GregorianCalendar(year, month, day);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	public String getNotes() {
		return notes;
	}
	
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void setDate(int year, int month, int day) {
		cal.set(year, month, day);
	}
	
	public GregorianCalendar getDate() {
		return cal;
	}
	
	public Category getCategory() {
		return categoryToBelongIn;
	}
	
	public void setCategory(Category newCategory) {
		categoryToBelongIn = newCategory;
	}
	
	public int compareTo(Entry e2) {
		long time1 = cal.getTimeInMillis();
		long time2 = e2.cal.getTimeInMillis();
		
		if (time1 > time2) {
			return 1;
		} else if (time1 == time2) {
			return 0;
		} else {
			return -1;
		}
	}
	
}
