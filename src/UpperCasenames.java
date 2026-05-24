import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCasenames{
    public List<String> getUpperCasenames(String[] names){
        List<String> filteredNames= Arrays.stream(names)
                .map(name -> name.toUpperCase())
                .sorted()
                .collect(Collectors.toList()).reversed();
        return filteredNames;
    }
}