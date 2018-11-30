public class makeDessert {
    public  static Choice getOption(String choice){
        if(choice.equalsIgnoreCase("dessert")){
            return new dessertChoice();
        }

        else if (choice.equalsIgnoreCase("topping")){
            return new extraChoice();
        }
        return null;
    }
}