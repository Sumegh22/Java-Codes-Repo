import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {
    public static void main(String[] args) {
        List<Integer> fibonacciList = generateFibonacci(10);
        System.out.println(fibonacciList);
    }

    static List<Integer> generateFibonacci(int n) {
        return Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
                .limit(n)
                .map(fib -> fib[0])
                .collect(Collectors.toList());
    }
}
