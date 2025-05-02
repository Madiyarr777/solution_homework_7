package airport;

import airport.TowerMediator;

public abstract class Aircraft {
    protected final String id;
    protected final TowerMediator tower;

    protected Aircraft(String id, TowerMediator tower) {
        this.id = id;
        this.tower = tower;
    }

    public void send(String msg) {
        tower.broadcast(msg, this);
    }

    public void request(Operation op) {
        tower.requestRunway(this, op);
    }

    public abstract void receive(String msg);
}
