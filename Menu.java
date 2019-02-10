package restaurantObjects;

import java.util.*;


public class Menu {

    List <Food> breakFastMenu;
    List <Food> lunchMenu;
    List <Food> dinnerMenu;
    List <Food> beverageMenu;

    public Menu() {
        breakFastMenu = new ArrayList<>();
        lunchMenu = new ArrayList<>();
        dinnerMenu = new ArrayList<>();
        beverage = new ArrayList<>();
    }

    public void addFood(Food food) {
        FoodType type = food.foodType;
        switch(type) {
            case BreakFast:
                breakFastMenu.add(food);
                break;
            case Lunch:
                lunchMenu.add(food);
                break;
            case Dinner:
                dinnerMenu.add(food);
                break;
            case Allday:
                breakFastMenu.add(food);
                lunchMenu.add(food);
                dinnerMenu.add(food);
        }
    }

    public void addBeverage(Beverage beverage) {
        beverageMenu.add(beverage);
    }
}