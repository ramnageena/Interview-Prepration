package java8Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1, 2, 11, 27, 32, 22, 76,12,23,12,11,44, 13, 33, 44);

        List<Integer> list = noList.stream().distinct().toList();
        System.out.println("Removed Duplicate I ways :"+ list);

        Set<Integer> list1 = noList.stream().collect(Collectors.toSet());
        System.out.println("Removed Duplicate II ways :"+ list1);

    }
}