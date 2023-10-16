package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    MenuItem FrenchFries = new MenuItem(3.99, "crispy", "appetizer", true, "French Fries");
        MenuItem GermanFries = new MenuItem(3.99, "juicy", "appetizer", false, "German Fries");
        MenuItem NorwegianFries = new MenuItem(3.99, "flavor", "appetizer", true, "Norwegian Fries");

        ArrayList<MenuItem> Burgers = new ArrayList<>();
        Menu FiveGuys = new Menu("Five Guys", Burgers);
        FiveGuys.addItem(FrenchFries);
        FiveGuys.addItem(GermanFries);
        FiveGuys.addItem(NorwegianFries);

        System.out.println(FiveGuys.getItems());
        System.out.println(FrenchFries);
        FiveGuys.removeItem(NorwegianFries);
        System.out.println(FiveGuys.getItems());
        System.out.println(FiveGuys.getLastUpdated());
        System.out.println(FrenchFries.getIsNew());
        System.out.println(FrenchFries.isEqual(NorwegianFries));
    }
}
