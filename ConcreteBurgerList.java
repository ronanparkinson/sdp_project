import java.util.LinkedList;
import java.util.List;

public class ConcreteBurgerList implements IBurgerList{
    private List <IBurger>burgers = new LinkedList();

    @Override
    public void addBurger(IBurger iburger) {
        this.burgers.add(iburger);
    }

    @Override
    public void removeBurger(IBurger iburger) {
        this.burgers.remove(iburger);
    }

    @Override
    public void notifyBurger() {
        for(IBurger iBurger : this.burgers) {
            iBurger.updateList();
        }
    }

    //public 
}