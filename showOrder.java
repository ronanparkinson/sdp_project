import java.util.LinkedList;
import java.util.List;

public class showOrder {
    public static void main(String[] args) {
        newOrder fillorder = new fillOrder();

        fillorder.setOrder(new Chips());
        fillorder.include();
        fillorder.setOrder(new Drink());
        fillorder.include();

        ConcreteBurgerList concreteBurgerList = new ConcreteBurgerList();
        ConcreteBurgerScreen concreteBurgerScreen = new ConcreteBurgerScreen();
        concreteBurgerScreen.display(concreteBurgerList);
        concreteBurgerList.addBurger(concreteBurgerScreen);
        System.out.println("Added a new Burger!");
        System.out.println(concreteBurgerList.getBurger());
        concreteBurgerList.notifyBurger();
        concreteBurgerList.removeBurger(concreteBurgerScreen);
        System.out.println(concreteBurgerList.getBurger());

        Customer customer = new Customer();
        System.out.println(customer.burger());

        Choice selection = makeDessert.getOption("dessert");
        dessert des = selection.getDessert("muffin");
        des.create();

        Choice selectionTwo = makeDessert.getOption("topping");
        Topping topping = selectionTwo.getExtra("chocolate");
        topping.extra();
        
        System.out.println(orderCost.getInstance().toString());
    }
}