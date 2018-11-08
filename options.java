public class options implements Order{
    @Override
    public String newMeal() {
        return "no meal";
    }

    @Override
    public String justBurger() {
        return "no burger";
    }

    @Override
    public String justDrink() {
        return "no drink";
    }

    @Override
    public String justChips() {
        return "no chips";
    }

    @Override
    public void foodMod() {

    }

    @Override
    public boolean eatin(String choice) {
        if (choice == "yes"){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean takeout(String choice) {
        if (choice == "yes"){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void sides() {

    }
}