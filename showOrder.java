public class showOrder {
    public static void main(String[] args) {
        newOrder fillorder = new fillOrder();

        //Using different methods were as the example uses the same method
        //maybe hae more then one drink
        //fillorder.setOrder(new Chips());
       // fillorder.include();
        fillorder.setOrder(new Chips());
        fillorder.include();
        fillorder.setOrder(new Drink());
        fillorder.include();
    }
}