import java.util.Iterator;
import java.util.Random;

public class MyRand implements Iterable<Integer> {
    private final Random random;
    private final int min;
    private final int max;

    public MyRand(int min, int max) {
        random = new Random();
        this.min = min;
        this.max = max;
    }

    @Override
    public MyIterator iterator() {
        return new MyRand.MyIterator();
    }

    protected class MyIterator implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;//Так как генерировать рандомные числа мы можем всегда
        }

        @Override
        public Integer next() {
            return random.ints(min, max+1).findFirst().getAsInt();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
