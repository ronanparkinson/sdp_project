public class newOrder {
    Order order;

    public void include(){
        order.justDrink();
        order.justBurger();
        order.justChips();
        order.newMeal();
    }

    public void setOrder(Order o){
        order = o;
    }
}
