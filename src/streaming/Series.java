package streaming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Series implements Iterable<Episode> {
    private final List<Season> seasons = new ArrayList<>();

    public void addSeason(Season s) {
        seasons.add(s);
    }

    @Override
    public Iterator<Episode> iterator() {
        return new BingeIterator(seasons);
    }
}
