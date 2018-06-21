import java.util.ArrayList;

/* Stores an array list of coordinates from entry data, and an array list of
 * coordinates based on budget/user info with 2 data points to represent
 * horizontal axis as dates and vertical axis as amount of dollars spent from
 * entries */

public class Line extends Graph {
	private String title;
	private ArrayList<Coordinate> realCoordinates; // from entries
	private ArrayList<Coordinate> projectedCoordinates; // from budget
	
	void setTitle(String titleIn) {
		title = titleIn;
	}
	
	public String getTitle() {
		return title;
	}
	
	/* Assigns the dates and costs for each entry from the list of entries to
	 * the respective variables as a coordinate in the list of coordinates */
	void assignEntryData(ArrayList<Entry> entries) {
		for(int i = 0; i < entries.size(); i++) {
			realCoordinates.get(i).setDate(entries.get(i).getDate());
			realCoordinates.get(i).setDollars(entries.get(i).getCost());
		}
	}
	
	/* Creates the list of projected coordinates based on the user-determined
	 * budgets */
	public void assignProjectedData() {
		
	}
	
	


}
