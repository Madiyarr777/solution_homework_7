package streaming;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Season implements Iterable<Episode> {
    private final List<Episode> episodes = new ArrayList<>();

    public void addEpisode(Episode e) {
        episodes.add(e);
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    @Override
    public Iterator<Episode> iterator() {
        return new SeasonIterator(episodes);
    }
}
