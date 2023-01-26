package org.example;

import restaurant.Menu;
import restaurant.MenuItem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Spaghetti", 12.99, "Spaghetti pasta with meat sauce", "Main Course");
        MenuItem item2 = new MenuItem("Caesar Salad", 8.99, "Romaine lettuce, croutons, parmesan cheese and Caesar dressing", "App");
        MenuItem item3 = new MenuItem("Tiramisu", 6.99, "Italian classic dessert made with mascarpone and coffee", "Dessert");

        ArrayList<MenuItem> items= new ArrayList<MenuItem>();
        items.add(item1);
        items.add(item2);
        items.add(item3);

       Menu menu = new Menu(items);

       menu.printMenu();
        System.out.println("menu last updated on: " + menu.lastUpdated());

        MenuItem retrievedItem = menu.getItem("Spaghetti");
        retrievedItem.printItem();

        menu.removeItem(item2);
        System.out.println("Menu after removing Caesar Salad:");
        menu.printMenu();

    }
}