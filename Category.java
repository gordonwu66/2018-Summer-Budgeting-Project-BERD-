import java.util.ArrayList;

public class Category {
	private String name;
	private Category parent;
	
	private ArrayList<Category> subCategories;
	private ArrayList<Entry> entriesInCategory;
	
	public Category(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getParent() {
		if(parent!=null)
			return parent.getName();
		else
			return null;
	}
	
	public void setParent(Category parent) {
		this.parent = parent;
	}
	
	public void addSubCategory(Category c) {
		subCategories.add(c);
	}
	
	public void addEntry(Entry e) {
		entriesInCategory.add(e);
	}
}
