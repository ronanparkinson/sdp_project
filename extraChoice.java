public class extraChoice extends Choice {
    @Override
    dessert getDessert(String dessert) {
        return null;
    }

    @Override
    Topping getExtra(String extra) {
        if(extra.equalsIgnoreCase("Chocolate")){
            return new Chocolate();
        }

        else if (extra.equalsIgnoreCase("Strawberry")){
            return new Strawberry();
        }

        else if (extra.equalsIgnoreCase("Caramel")){
            return new Caramel();
        }

        return null;
    }
}
