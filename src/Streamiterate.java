import java.util.stream.Stream;

public class Streamiterate{
    public Stream<Long> createStream(long seed , long a, long c, long m){
        Stream<Long> stream = Stream.iterate(seed, n -> ((a * n) + c) % m)
                .limit(5);
        return stream;
    }
}