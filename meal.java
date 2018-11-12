public class meal implements Order{
    @Override
    public void newMeal() {
        System.out.println("Burger, chips and drink added to order!");
    }

    @Override
    public void justBurger() {
    }

    @Override
    public void justDrink() {

    }

    @Override
    public void justChips() {

    }

    @Override
    public void foodMod() {

    }

    @Override
    public String eatin() {
        return null;
    }

    @Override
    public String takeout() {
        return null;
    }


    @Override
    public void sides() {

    }
}