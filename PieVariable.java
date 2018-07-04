/*
 * Data points for the pie graph to hold category name and percentage values
 * for the super categories
 */
public class PieVariable {
	private String name;
	private double percentage;
	
	public PieVariable(String nameIn) {
		name = nameIn;
		percentage = 0;
	}
	
	public PieVariable(String nameIn, double percentageIn) {
		name = nameIn;
		percentage = percentageIn;
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

}
