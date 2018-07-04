import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Spreadsheet extends Visual {
	private ArrayList<Entry> allEntries;
	private ArrayList<Category> superCategories;
	
	public Spreadsheet() {
		allEntries = new ArrayList<Entry>();
		superCategories = new ArrayList<Category>();
	}
	
	// add to category list
	// edit 7/4/2018: took addEntry functionality and put it into addEntryToCategoryList
	//              : changed addEntryToCagetoryList name to addEntry
	public void addEntry(Entry entryToAdd, Category categoryToAdd) {
		categoryToAdd.addEntry(entryToAdd);
		allEntries.add(entryToAdd);
		Collections.sort(allEntries, new EntryComparator());
	}
	
	// use to sort entry list
	private class EntryComparator implements Comparator<Entry> {
		@Override
		public int compare(Entry e1, Entry e2) {
			return e1.compareTo(e2);
		}
	}

	// remove target entry from both entry and category lists
	// return removed entry
	public Entry removeEntry(Entry target) {
		Entry entry = null;

		for (Entry temp : allEntries) {
			if (temp.equals(target)) {
				entry = temp;
				allEntries.remove(temp);
			}
		}
		
		return entry;
	}
	
	// add super-category with no parents
	public void addCategory(Category newCategory) {
		superCategories.add(newCategory);
	}
	
	// add sub-category under parent 
	public void addCategory(Category newCategory, Category parent) {
		parent.addSubCategory(newCategory);
	}
	
	// remove target category from category list
	public void destroyCategory(Category target) {
		// ???
		/*
		Category category = null, parent = target.getParent();
		ArrayList<Category> path = new ArrayList<Category>();
		
		while (parent != null) {
			path.add(0, parent);
			parent = parent.getParent();
		}
		
		for (Category temp1 : superCategories) {
			if (temp1.equals(path.get(0))) {
				
			}
		}
		
		while (path.size() > 0) {
			
		}
		*/
		
		ArrayList<Entry> targetEntries = new ArrayList<Entry>();
		targetEntries = target.destroy(targetEntries);
		for (Entry entry : targetEntries) {
			removeEntry(entry);
		}
	}
	
		/// idk if we use these but i'll put them here in case we do
	// return entry list
	public ArrayList<Entry> getEntryList() {
		return allEntries;
	}
	
	// return category list
	public ArrayList<Category> getSuperCategoryList() {
		return superCategories;
	}
	
	public String toString() {
		String str = "";
		
		
		
		return str;
	}
}
