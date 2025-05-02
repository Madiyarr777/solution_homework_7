package airport;

import airport.Aircraft;
import airport.TowerMediator;

public class CargoPlane extends Aircraft {
    public CargoPlane(String id, TowerMediator tower) {
        super(id, tower);
    }

    @Override
    public void receive(String msg) {
        System.out.println("airport.CargoPlane " + id + ": " + msg);
    }
}
