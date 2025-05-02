package streaming;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ShuffleSeasonIterator implements EpisodeIterator {
    private final List<Episode> shuffled;
    private int index = 0;

    public ShuffleSeasonIterator(List<Episode> list, long seed) {
        this.shuffled = new ArrayList<>(list);
        Collections.shuffle(this.shuffled, new Random(seed));
    }

    @Override
    public boolean hasNext() {
        return index < shuffled.size();
    }

    @Override
    public Episode next() {
        return shuffled.get(index++);
    }
}
