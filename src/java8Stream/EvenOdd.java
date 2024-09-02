package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOdd {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1, 2, 11, 27, 32, 22, 76, 13, 33, 44);
        Map<Boolean, List<Integer>> evenOdd = noList.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println("Even :"+evenOdd.get(true));
        System.out.println("Odd :"+evenOdd.get(false));

        //sum of all even number and odd number
        System.out.println("Sum of Even No :"+evenOdd.get(true).stream().mapToInt(i->i).sum());
        System.out.println("Sum of Odd No :"+evenOdd.get(false).stream().mapToInt(i->i).sum());



    }
}
