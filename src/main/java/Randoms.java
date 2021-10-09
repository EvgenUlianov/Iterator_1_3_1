import java.util.Iterator;
import java.util.Random;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;

    private int max;

    public int getMax() {
        return max;
    }

    public int getValue() {
        return Integer.valueOf((random.nextInt(max - min + 1)) + min);
    }
    public Randoms(int min, int max) {
        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {//
        return new RandomsIterator(this);
    }

}
