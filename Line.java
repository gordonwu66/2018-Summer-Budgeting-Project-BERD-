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
	
	/*
	 * Assigns the dates and costs for each entry from the list of entries to
	 * the respective variables as a coordinate in the list of coordinates
	 */
	void assignData(ArrayList<Entry> entries, ArrayList<Category> superCategories) {
		for(int i = 0; i < entries.size(); i++) {
			Coordinate currCoordinate = new Coordinate(entries.get(i).getDate(), entries.get(i).getCost());
			realCoordinates.add(currCoordinate);
		}
		
		// will add extra features related to user-defined categories
	}
	
	/* 
	 * Creates the list of projected coordinates based on the user-determined
	 * budgets
	 */
	public void assignProjectedData() {
		
	}
	
	public String toString() {
		String toReturn = "";
		for(Coordinate c : realCoordinates) {
			toReturn += "\n" +c.getDate() +" " +c.getDollars();
		}
		return toReturn;
	}


}