import airport.*;
import streaming.*;

public class Application {
    public static void main(String[] args) {
        demoIterator();
        System.out.println();
        demoMediator();
    }

    private static void demoIterator() {
        Season s1 = new Season();
        s1.addEpisode(new Episode("Pilot", 1800));
        s1.addEpisode(new Episode("Cliffhanger", 1850));
        System.out.println("== Normal ==");
        EpisodeIterator normal = new SeasonIterator(s1.getEpisodes());
        while (normal.hasNext()) System.out.println(normal.next().getTitle());

        System.out.println("== Reverse ==");
        EpisodeIterator reverse = new ReverseSeasonIterator(s1.getEpisodes());
        while (reverse.hasNext()) System.out.println(reverse.next().getTitle());

        System.out.println("== Shuffle ==");
        EpisodeIterator shuffle = new ShuffleSeasonIterator(s1.getEpisodes(), 42L);
        while (shuffle.hasNext()) System.out.println(shuffle.next().getTitle());

        Series series = new Series();
        series.addSeason(s1);
        System.out.println("== Binge ==");
        for (Episode e : series) {
            System.out.println(e.getTitle());
        }
    }

    private static void demoMediator() {
        ControlTower tower = new ControlTower();
        PassengerPlane  p = new PassengerPlane("P1", tower);
        CargoPlane c = new CargoPlane("C1", tower);
        Helicopter      h = new Helicopter("H1", tower);

        p.request(Operation.LANDING);

        h.request(Operation.TAKEOFF);

        c.send("MAYDAY");
    }
}
