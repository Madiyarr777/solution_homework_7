package airport;

public interface TowerMediator {
    void broadcast(String msg, Aircraft sender);
    void requestRunway(Aircraft a, Operation op);
}
