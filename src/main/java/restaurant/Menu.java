package restaurant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> items;
    private Date lastUpdated;
    //add constructor with an arraylist of items, so i can create a menu with a set of items.
    public Menu(ArrayList<MenuItem> items) {
        this.items = new ArrayList<MenuItem>();
        this.lastUpdated = new Date();
    }

    public void addItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = new Date();
    }

    public void removeItem(MenuItem item) {
        this.items.remove(item);
        this.lastUpdated = new Date();
    }

    public void printMenu() {
        for (MenuItem item : items) {
            item.printItem();
        }
    }

    public Date lastUpdated() {
        return this.lastUpdated;
    }

    public MenuItem getItem(String name) {
        for (MenuItem item : items) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }
}





