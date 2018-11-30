public class dessertChoice extends Choice{
    @Override
    dessert getDessert(String dessert) {
        if(dessert.equalsIgnoreCase("Cone")) {
            return new Cone();
        }

        else if(dessert.equalsIgnoreCase("Sundae")){
            return new Sundae();
        }

        else if (dessert.equalsIgnoreCase("Muffin")){
            return new Muffin();
        }
        return null;
    }

    @Override
    Topping getExtra(String extra) {
        return null;
    }
}
