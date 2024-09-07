package java8Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class GeneralQuestion {
    public static void main(String[] args) {
        List<Integer> noList = Arrays.asList(1, 2, 11, 22, 33, 22, 44, 55, 66, 43,44, 21, 34, 65,54, 43);
        List<Integer> noList2 = Arrays.asList(454,4474,77,44,44, 66, 43,44, 21, 34, 65,54, 43);

        //remove duplicate
        List<Integer> removedDuplicate = noList.stream().distinct().toList();
        System.out.println("Removed Duplicate :"+removedDuplicate);

        //count of the element
        long count = noList.stream().count();
        System.out.println("Count of element :"+count);

        //sum of all element
        int sum = noList.stream().mapToInt(i -> i).sum();
        System.out.println("sum of all element :"+sum);

        //find the element which are available for both the list
        List<Integer> commonList = noList.stream().filter(noList2::contains).toList();
        System.out.println("Common element in both the list :"+commonList);

        //maximum element from the list
        Integer max = noList.stream().max((a,b) -> a-b).get();
        System.out.println("Maximum :"+ max);


        //maximum element from the list
        Integer min = noList.stream().min((a,b) -> a-b).get();
        System.out.println("Minimum :"+ min);

        //print the numbers which are multiples of 5?
        List<Integer> multiplyBy5 = noList.stream().filter(i -> i % 5 == 0).toList();
        System.out.println("Multiply by 5 :"+multiplyBy5);

//How do you merge two unsorted arrays into single sorted array using Java 8 streams?

        int[] a =  {4, 2, 7, 1};
        int[] b =  {8, 3, 9, 5};

        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        System.out.println("Added both the arrays into list :"+ Arrays.toString(c));


        // Convert the arrays to ArrayLists
        String[] fruits = {"Apple", "Orange", "Banana", "Mango"};
        String[] fruit = {"Apple", "Litchi", "Grapes", "Mango"};

        ArrayList<String> l1 = new ArrayList<>(Arrays.asList(fruits));
        ArrayList<String> l2 = new ArrayList<>(Arrays.asList(fruit));
        l1.addAll(l2);
        List<String> list = l1.stream().distinct().sorted().toList();
        System.out.println(" Merged List :"+list);

       // How do you get three maximum numbers and three minimum numbers from the given list of integers?

        List<Integer> fmin = noList.stream().sorted().limit(3).toList();
        System.out.println("First 3 minimum :"+ fmin);

        List<Integer> fMax = noList.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
        System.out.println("First 3 maximum :"+ fMax);

        //Given a list of strings, sort them according to increasing order of their length?
        List<String> generalList = Arrays.asList("Boy", "Donkey", "Elephant", "ice-cream", "Apple");
        List<String> list1 = generalList.stream().sorted((a1, b1) -> Integer.compare(a1.length(), b1.length())).toList();
        System.out.println("Sorted based on length : "+list1);
    }
}
