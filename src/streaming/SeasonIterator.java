package streaming;

import java.util.List;

public class SeasonIterator implements EpisodeIterator {
    private final List<Episode> list;
    private int index = 0;

    public SeasonIterator(List<Episode> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Episode next() {
        return list.get(index++);
    }
}
