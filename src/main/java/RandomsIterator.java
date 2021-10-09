import java.util.Iterator;
import java.util.Random;
import java.util.function.Consumer;

public class RandomsIterator implements Iterator<Integer> {
    protected Randoms randoms;
    private int min;
    private int max;
    private int nextValue;

    private void doStepToValue() {
        nextValue = this.randoms.getValue();
    }

    public RandomsIterator(Randoms randoms) {
        this.randoms = randoms;
        doStepToValue();
    }

    @Override
    public boolean hasNext() {
        if (nextValue >= this.randoms.getMax()){
            System.out.println("Следующее число 100, больше выдавать не могу");
            return false;
        }
        return true;
    }

    @Override
    public Integer next() {
        int nextValueCash = nextValue;
        doStepToValue();
        return nextValueCash;
    }

    @Override
    public void remove() {
        // do nothing;
    }

}

