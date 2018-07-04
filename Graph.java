import java.util.ArrayList;

/* Abstract class for Line and Pie that will store a graph title and list
 * of relevant data points, and will order those data points by value */
public abstract class Graph {
	
	abstract void setTitle(String titleIn);
	
	abstract void assignData(ArrayList<Entry> entries, ArrayList<Category> superCategories); 
}
