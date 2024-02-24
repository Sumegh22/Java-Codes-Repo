package FunctionalProgramming;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Functional1 {
   
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyFunctional1 method1 = () ->  "testString";
        System.out.println(method1.printString());


        Predicate<Integer> isEven = i -> i%2 ==0;

        List<Integer> ls = List.of(1,2,4,8,3,6,7,4,12,45,87,78);
        System.out.println();

        List<String> los = List.of("puma","uma", "chumma", "addidas", "reebok", "apple", "nike");
        List<String> sol = los.stream().sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo)).collect(Collectors.toList());

        System.out.println(sol);
    }

}
