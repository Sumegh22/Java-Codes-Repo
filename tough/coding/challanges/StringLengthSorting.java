import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthSorting {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        List<String> sortedList = stringList.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());

        System.out.println(sortedList);
    }
}
