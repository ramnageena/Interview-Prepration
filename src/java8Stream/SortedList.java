package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedList {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1, 2, 11, 27, 32, 22, 76,12,23,12,11,44, 13, 33, 44);
        List<Integer> list = noList.stream().sorted().toList();
        System.out.println("Sorted the list in Increasing order :"+ list);
        List<String> sentences = Arrays.asList("hello world", "java streams");
        Set<String> collect = sentences.stream().map(String::toUpperCase).collect(Collectors.toSet());
        System.out.println(collect);

    }
}
