import java.util.ArrayList;

/* 
 * Stores a list of entries in chronological order based on purchase date from
 * tree set of all entries recorded by user
 */
public class History extends Visual {
	
	private String name;
	private ArrayList<Entry> entries;
	
	public History(String nameIn, ArrayList<Entry> entriesIn) {
		name = nameIn;
		entries = entriesIn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public ArrayList<Entry> getEntries() {
		return entries;
	}
	
	public void setEntries(ArrayList<Entry> newEntries) {
		entries = newEntries;
	}
	
	public String toString() {
		String toReturn = "";
		for(Entry e : entries) {
			toReturn += "\n" +e.getDate() +" " +e.getName() +" " +e.getCost() +" " +e.getNotes();
		}
		return toReturn;
	}
}
