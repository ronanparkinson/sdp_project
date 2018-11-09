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
    public String eatin(String choice) {
        if (choice == "yes"){
            return "Have a seat!";
        }
        else {
            return "Ill put it in a bag.";
        }
    }

    @Override
    public void sides() {

    }
}