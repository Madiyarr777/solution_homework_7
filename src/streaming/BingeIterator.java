package streaming;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class BingeIterator implements Iterator<Episode> {
    private final List<Season> seasons;
    private int seasonIdx = 0;
    private EpisodeIterator current;

    public BingeIterator(List<Season> seasons) {
        this.seasons = seasons;
        if (!seasons.isEmpty()) {
            current = new SeasonIterator(seasons.get(0).getEpisodes());
        }
    }

    @Override
    public boolean hasNext() {
        if (current == null) return false;
        if (current.hasNext()) return true;
        while (++seasonIdx < seasons.size()) {
            current = new SeasonIterator(seasons.get(seasonIdx).getEpisodes());
            if (current.hasNext()) return true;
        }
        return false;
    }

    @Override
    public Episode next() {
        if (!hasNext()) throw new NoSuchElementException();
        return current.next();
    }
}
