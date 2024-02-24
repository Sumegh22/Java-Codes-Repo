import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciList = generateFibonacci();
        System.out.println(fibonacciList);
    }

    static List<Integer> generateFibonacci() {

        List<Integer> fibo = Stream.iterate(new int[] {0,1}, arr ->  new int[]{arr[1], arr[0]+arr[1]})
                        .map(arr -> arr[0]).limit(15).collect(Collectors.toList());

                        // Stream.iterate(new int[] {0,1}, e -> new int[]{e[1], e[1]+e[0]}).map(e -> e[0]).limit(10)

        return fibo ;   
    }


    


}
