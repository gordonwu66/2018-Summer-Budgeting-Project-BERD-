import java.util.ArrayList;

public class Category {
	private String name;
	private Category parent;
	
	private static int globalID = 0;
	private int instanceID;
	
	private ArrayList<Category> subCategories;
	private ArrayList<Entry> entriesInCategory;
	
	public Category(String name) {
		this.name = name;
		instanceID = globalID;
		globalID++;
	}
	
	public int getID() {
		return instanceID;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Category getParent() {
		return parent;
	}
	
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	public void addSubCategory(Category category) {
		subCategories.add(category);
	}
	
	public void addEntry(Entry newEntry) {
		entriesInCategory.add(newEntry);
		newEntry.setCategory(this);
	}
	
	public ArrayList<Entry> destroy(ArrayList<Entry> targetEntries) {
		// add entries in destroyed category to target list
		for (Entry entry : entriesInCategory) {
			targetEntries.add(entry);
		}
		
		// repeat with all sub-categories
		for (Category category : subCategories) {
			category.destroy(targetEntries);
		}
		
		return targetEntries;
	}
}