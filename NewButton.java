public class NewButton implements NewBurger{
    LimitedBurger limitedBurger;

    public NewButton(LimitedBurger limitedBurger) {
        this.limitedBurger = limitedBurger;
    }

    @Override
    public String order() {
       return this.limitedBurger.specificBurger();
    }
}