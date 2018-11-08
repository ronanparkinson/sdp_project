public class meal implements Order{
    @Override
    public String newMeal() {
        return "Burger, chips and drink added to order!";
    }

    @Override
    public String justBurger() {
        return "Just a burger";
    }

    @Override
    public String justDrink() {
        return "Just a drink";
    }

    @Override
    public String justChips() {
        return "Just a cola";
    }

    @Override
    public void foodMod() {

    }

    @Override
    public boolean eatin(String choice) {
        return false;
    }

    @Override
    public boolean takeout(String choice) {
        return false;
    }

    @Override
    public void sides() {

    }
}