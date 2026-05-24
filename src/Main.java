import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        String[] names= {"Ivan" , "Katya","Roma","Andrej", "Milena" , "Vadim"};
        String[] numbers = {"1, 2, 0", "4, 5"};
        long seed = 1 ;
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        Stream<String> first = Stream.of("1", "3", "5", "7");
        Stream<String> second = Stream.of("2", "4", "6");
        OddNames oddNames = new OddNames();
        UpperCasenames upperCasenames = new UpperCasenames();
        Sorter sorter = new Sorter();
        Streamiterate streamiterate = new Streamiterate();
        MixClass mixClass = new MixClass();

        System.out.println(oddNames.getoddnames(names));
        System.out.println(upperCasenames.getUpperCasenames(names));
        Sorter.sort(numbers);
        System.out.println(streamiterate.createStream(seed,a,c,m).collect(Collectors.toList()));
        System.out.println(MixClass.zip(first,second).collect(Collectors.toList()));
    }
}