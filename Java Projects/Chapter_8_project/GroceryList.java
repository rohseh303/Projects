import java.util.ArrayList;

public class GroceryList {
	public ArrayList<GroceryItemOrder> list;
	public GroceryList() {
		list = new ArrayList<GroceryItemOrder>();
	}
	public void add(GroceryItemOrder item) {
		if (list.size() < 10) {
			list.add(item);
		}
		else {
			System.err.println("Cannot add item. Maximum limit of 10 items reached");
		}
	}
	public double getTotalCost() {
		double totalcost = 0;
		double itemcost = 0;
		for(int i = 0; i < list.size(); i++) {
			GroceryItemOrder currentItem = list.get(i);
			itemcost = currentItem.getCost();
			totalcost += itemcost;
		}
		return totalcost;
	}
}

class GroceryItemOrder {
	public static int num = 0;
	public static double uprice = 0;
	public static String item = "";
	public GroceryItemOrder(String name, int quantity, double pricePerUnit) {
		num = quantity;
		uprice = pricePerUnit;
		item = name;
	}
	public double getCost() {
		double q = (double)(num);
		return (q * uprice); 
	}
	public void setQuantity(int quantityreset) {
		num = quantityreset;
	}
}