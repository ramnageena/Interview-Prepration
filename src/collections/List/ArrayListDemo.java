package collections.List;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list= new CopyOnWriteArrayList<>();
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(1);
        list.add(3);

        System.out.println("List :"+ list);
        System.out.println(list.get(2)); //list starting from 0 index

        //for iterating of list
        for (Integer i:list){
            System.out.println("ForEach Iteration :"+ i);
        }

         // Removing the element for specific index
        Integer remove = list.remove(2);
        System.out.println("Removed element: "+ remove);
        System.out.println("Remaining element after removing :"+ list);

        //Given an ArrayList of integers, check if a specific value is present in the list.
        boolean contains = list.contains(5);
        System.out.println("Value is present: "+contains);

        //Write a program to find the maximum and minimum values in an ArrayList of integers.
        List<Integer> list1 = Arrays.asList(1, 3, 22, 1, 33, 45, 66, 32);
        Integer max = Collections.max(list1);
        Integer min = Collections.min(list1);
        System.out.println("Maximum value from the list: "+max);
        System.out.println("Minimum value from the list: "+min);

        //Write a program to sort the arraylist
        Collections.sort(list1);
        System.out.println("Sorted list: "+list1);

        //Given an ArrayList of strings, sort the list in alphabetical order and print it.
        List<String> list2 = Arrays.asList("Ram", "Akashatha", "Gokul", "Divya", "Rahul");
        Collections.sort(list2);
        System.out.println("Sorted list based on alphabetical order : "+list2);



    }


}
/*

List :[2, 0, 4, 1, 3]
4
ForEach Iteration :2
ForEach Iteration :0
ForEach Iteration :4
ForEach Iteration :1
ForEach Iteration :3
Removed element: 4
Remaining element after removing :[2, 0, 1, 3]
Value is present: false
Maximum value from the list: 66
Minimum value from the list: 1
Sorted list: [1, 1, 3, 22, 32, 33, 45, 66]
Sorted list based on alphabetical order : [Akashatha, Divya, Gokul, Rahul, Ram]

 */
