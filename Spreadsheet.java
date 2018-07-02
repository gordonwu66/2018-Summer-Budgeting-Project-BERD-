import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
// import java.util.HashMap;

public class Spreadsheet {
	// HashMap<GregorianCalendar, ArrayList<Entry>> allEntries;
	ArrayList<Entry> allEntries;
	ArrayList<Category> categories;
	
	public Spreadsheet() {
		// allEntries = new HashMap<GregorianCalendar, ArrayList<Entry>>();
		allEntries = new ArrayList<Entry>();
		categories = new ArrayList<Category>();
	}
	
	public void addEntry(Entry newEntry) {
		allEntries.add(newEntry);
		Collections.sort(allEntries);
	}
	
	public Entry removeEntry(Entry toRemove) {
		Entry entry = null;
		
		// fix me
		for (Entry temp : allEntries) {
			if(temp.equals(toRemove)) {
				entry = temp;
				allEntries.remove(temp);
			}
		}
		
		return entry;
	}
	
	public void addCategory(Category newCategory) {
		categories.add(newCategory);
	}
	
	public Category removeCategory() {
		Category category = null;
		
		for (Category temp : categories) {
			
		}
		
		return category;
	}

	public String toString() {
		String str = "";
		
		
		
		return str;
	}	
}
