package airport;

import airport.Aircraft;
import airport.TowerMediator;

public class Helicopter extends Aircraft {
    public Helicopter(String id, TowerMediator tower) {
        super(id, tower);
    }

    @Override
    public void receive(String msg) {
        System.out.println("airport.Helicopter " + id + ": " + msg);
    }
}
