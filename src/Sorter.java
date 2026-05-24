import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorter{
    public static void sort(String[] numbers){
        String result = Arrays.stream(numbers)
                .flatMap(str -> Arrays.stream(str.split(",\\s*")))
                .map(number -> Integer.parseInt(number))
                .sorted()
                .map(number -> String.valueOf(number))
                .collect(Collectors.joining(", "));
        System.out.println(result);
    }
}
