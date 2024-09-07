package java8Stream;

import java.util.Arrays;
import java.util.List;

public class ReverseSortedList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 11, 22, 33, 22, 44, 55, 66, 43, 21, 34, 65, 43);
        List<Integer> list1 = list.stream().sorted((a, b) -> b - a).toList();
        System.out.println("Reversed order :"+list1);
    }
}
