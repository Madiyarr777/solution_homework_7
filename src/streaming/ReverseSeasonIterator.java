package streaming;

import java.util.List;

public class ReverseSeasonIterator implements EpisodeIterator {
    private final List<Episode> list;
    private int index;

    public ReverseSeasonIterator(List<Episode> list) {
        this.list = list;
        this.index = list.size() - 1;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Episode next() {
        return list.get(index--);
    }
}
