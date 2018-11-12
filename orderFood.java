public class orderFood{
    Order order;

    public Order newFoodOrder(String request){
        if(request.equals("burger")){
            order = new Burger();
        }
        else if (request.equals("cola")){
            order = new Drink();
        }
        else if (request.equals("chips")){
            order = new Chips();
        }
        else if (request.equals("meal")){
            order = new meal();
        }
        return order;
    }
}