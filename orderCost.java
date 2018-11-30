public class orderCost {
    private static orderCost ourInstance = new orderCost();

    public static orderCost getInstance() {

        if(ourInstance == null){
            ourInstance = new orderCost();
        }

        return ourInstance;
    }


    private orderCost() {
    }

    @Override
    public String toString() {
        return "The cost of the order iS: ";
    }
}
