package airport;

import airport.Aircraft;
import airport.TowerMediator;

public class PassengerPlane extends Aircraft {
    public PassengerPlane(String id, TowerMediator tower) {
        super(id, tower);
    }

    @Override
    public void receive(String msg) {
        System.out.println("airport.PassengerPlane " + id + ": " + msg);
    }
}
