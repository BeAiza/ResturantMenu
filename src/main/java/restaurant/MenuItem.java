package restaurant;
import java.util.Date;
import java.util.ArrayList;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date addedDate;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
        this.addedDate = new Date();
    }

    public boolean isNew() {
        return this.isNew;
    }

    public void printItem() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: $" + this.price);
        System.out.println("Description: " + this.description);
        System.out.println("Category: " + this.category);
        System.out.println("Is New: " + this.isNew);
        System.out.println("Added Date: " + this.addedDate);
    }

    public boolean equals(MenuItem other) {
        return this.name.equals(other.name) && this.price == other.price && this.description.equals(other.description) && this.category.equals(other.category);
    }

    public String getName() {
        return this.name;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public Date getAddedDate() {
        return this.addedDate;
    }
}