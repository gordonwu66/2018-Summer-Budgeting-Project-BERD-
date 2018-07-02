import java.util.ArrayList;
import java.util.Collections;
import java.util.GregorianCalendar;
// import java.util.HashMap;

public class Spreadsheet {
	// HashMap<GregorianCalendar, ArrayList<Entry>> allEntries;
	ArrayList<Entry> allEntries;
	ArrayList<Category> superCategories;
	
	public Spreadsheet() {
		// allEntries = new HashMap<GregorianCalendar, ArrayList<Entry>>();
		allEntries = new ArrayList<Entry>();
		superCategories = new ArrayList<Category>();
	}
	
	public void addEntry(Entry newEntry) {
		allEntries.add(newEntry);
		
		// fix sort
		Collections.sort(allEntries);
		
	}
	
	public Entry removeEntry(Entry toRemove) {
		Entry entry = null;

		for (Entry temp : allEntries) {
			if(temp.equals(toRemove)) {
				entry = temp;
				allEntries.remove(temp);
			}
		}
		
		return entry;
	}
	
	// adds a super category with no parents
	public void addCategory(Category newCategory) {
		superCategories.add(newCategory);
	}
	
	// adds the subcategory under its parent 
	public void addCategory(Category newCategory, Category parent) {
		parent.addSubCategory(newCategory);
	}
	
	public Category removeCategory() {
		Category category = null;
		
		for (Category temp : superCategories) {
			
		}
		
		return category;
	}
	
	public void addEntryToCategory() {
		// 
	}

	public String toString() {
		String str = "";
		
		
		
		return str;
	}	
}
