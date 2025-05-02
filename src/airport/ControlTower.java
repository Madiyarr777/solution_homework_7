package airport;

import airport.Aircraft;
import airport.TowerMediator;

import java.util.LinkedList;
import java.util.Queue;

public class ControlTower implements TowerMediator {
    private final Queue<Aircraft> landingQ = new LinkedList<>();
    private final Queue<Aircraft> takeoffQ = new LinkedList<>();

    @Override
    public synchronized void broadcast(String msg, Aircraft sender) {
        if ("MAYDAY".equalsIgnoreCase(msg.trim())) {
            sender.receive("Runway cleared for emergency!");
            landingQ.remove(sender);
            landingQ.add(sender);
            processNext();
            return;
        }
        System.out.println("Tower broadcasts: " + msg);
    }

    @Override
    public synchronized void requestRunway(Aircraft a, Operation op) {
        (op == Operation.LANDING ? landingQ : takeoffQ).add(a);
        processNext();
    }

    private void processNext() {
        if (!landingQ.isEmpty()) {
            landingQ.poll().receive("Cleared to land.");
        } else if (!takeoffQ.isEmpty()) {
            takeoffQ.poll().receive("Cleared for takeoff.");
        }
    }
}
