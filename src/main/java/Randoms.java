import java.util.Iterator;
import java.util.Random;


public class Randoms implements Iterable<Integer> {
    protected Random random;
    private int min;
    private int max;

    public Randoms(int min, int max) {

        this.random = new Random();
        this.min = min;
        this.max = max;
    }

    public int getRandomNumberUsingNextInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }


    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandomNumberUsingNextInt(min, max);
            }
        };
    }
}