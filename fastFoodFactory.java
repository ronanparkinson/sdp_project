public class fastFoodFactory {
    createFood cF;

    public fastFoodFactory(createFood cF){
        this.cF = cF;
    }

    public Order newFoodOrder(String request){
        Order order = null;

        order = cF.food(request);
        return order;
    }
}
