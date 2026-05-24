import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNames{
    public List<String> getoddnames(String[] names){
        List<String> nameslist = new ArrayList<>(List.of(names)); {
        }
        Stream<String> nameStream = Arrays.stream(names)
                .filter(name -> nameslist.indexOf(name)%2 != 0)
                .map(name -> String.valueOf(nameslist.indexOf(name))  +". " + name);
        List<String> filteredNames = nameStream.collect(Collectors.toList());
        return filteredNames;
    }
}