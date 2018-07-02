
public class Category {
	private String name;
	private Category parent;
	
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
	
	public void setParent(Category newParent) {
		parent = newParent;
	}
}
