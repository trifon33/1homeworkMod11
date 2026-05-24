import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class MixClass{
    public static <A> Stream<A> zip(Stream<A> streamA, Stream<A> streamB) {
        final Iterator<A> iteratorA = streamA.iterator();
        final Iterator<A> iteratorB = streamB.iterator();
        final Iterator<A> iteratorC = new Iterator<A>() {
            private boolean toggle = true;
            @Override
            public boolean hasNext() {
                return iteratorA.hasNext() && iteratorB.hasNext();
            }

            @Override
            public A next() {
                if (toggle) {
                    toggle = false;
                    return iteratorA.next();
                } else {
                    toggle = true;
                    return iteratorB.next();
                }
            }
        };

        final boolean parallel = streamA.isParallel() || streamB.isParallel();
        return iteratorToFiniteStream(iteratorC, parallel);
    }

    public static <T> Stream<T> iteratorToFiniteStream(Iterator<T> iterator, boolean parallel) {
        final Iterable<T> iterable = () -> iterator;
        return StreamSupport.stream(iterable.spliterator(), parallel);
    }
}