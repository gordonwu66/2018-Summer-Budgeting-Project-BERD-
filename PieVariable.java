/*
 * Data points for the pie graph to hold category name and percentage values
 * for the super categories
 */
public class PieVariable {
	private String name;
	private double percentage;
	private int catID;
	
	public PieVariable(String nameIn, int iD) {
		name = nameIn;
		catID = iD;
		percentage = 0;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	
	public double getPercentage() {
		return percentage;
	}
	
	public void setPercentage(double newPercentage) {
		percentage = newPercentage;
	}
	
	public void addPercentage(double percentageToAdd) {
		percentage += percentageToAdd;
	}
	
	public int getID() {
		return catID;
	}

}
