import java.util.ArrayList;

/*
 * Assigns percentage values to each of the broadest categories in relation to 
 * its proportion of total user spending to be used in drawing the pie graph 
 */

public class Pie extends Graph {
	private String title;
	private ArrayList<PieVariable> variables;
	
	private int totalSpending = 0;
	
	void setTitle(String titleIn) {
		title = titleIn;
		
	}
	
	/*
	 * Assigns data for each super category in the spreadsheet passed as a
	 * parameter
	 */
	public void assignData(ArrayList<Entry> entries, ArrayList<Category> supercategories) {
		for(int i = 0; i < supercategories.size(); i++) {
			PieVariable currVar = new PieVariable(supercategories.get(i).getName(), supercategories.get(i).getID());
			variables.add(currVar);
		}
		for(int i = 0; i < entries.size(); i++) {
			totalSpending += entries.get(i).getCost();
			
			for(int j = 0; j < variables.size(); j++) {
				if(entries.get(i).getCategory().getID() == (variables.get(i).getID())) {
					variables.get(i).setPercentage(variables.get(i).getPercentage() + entries.get(i).getCost());
				}
			}
		}
		
		for(int i = 0; i < variables.size(); i++) {
			variables.get(i).setPercentage(variables.get(i).getPercentage() / totalSpending);
		}
	}
	
	public String toString() {
		String toReturn = "";
		for(PieVariable p : variables) {
			toReturn += "\n" +p.getName() +" " +p.getID() +" " +p.getPercentage();
		}
		return toReturn;
	}

}
