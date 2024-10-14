import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 6, 6, 7, 8, 9, 10));


        Optional<Integer> resultEven = numbers.stream()
                .filter(z -> z % 2 == 0)
                .reduce(Integer::sum);

        Optional<Integer> resultOdd = numbers.stream()
                .filter(z -> z % 2 != 0)
                .reduce(Integer::sum);


        List<Integer> resultList = numbers.stream()
                .distinct().toList();
        System.out.println(resultEven.get());
        System.out.println(resultOdd.get());
        System.out.println(resultList);
    }
}
