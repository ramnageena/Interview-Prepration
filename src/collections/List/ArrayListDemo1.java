package collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> listString = new ArrayList<>();

        listString.add("1");
        listString.add("2");
        listString.add("3");
        listString.add("4");
        listString.add("5");
        listString.add("6");
        listString.add("7");
        listString.add("8");
        listString.add("9");
        listString.add("10");

        //increase the capacity manually
        listString.ensureCapacity(20);

        //decrease the capacity manually
        listString.trimToSize();

        //size of arrayList
        System.out.println(listString.size());

        //  How do you find out whether the given ArrayList is empty or not?
        boolean isListEmpty = !listString.isEmpty();//true
        System.out.println("List is empty or not :" + isListEmpty); //false

        //How do you get the position of a particular element in an ArrayList?
        int i = listString.indexOf("1");
        System.out.println(i);//0

        //if value is not present in the arrayList then will return -1
        int i2 = listString.indexOf("11");
        System.out.println(i2);//-1

        // How do you convert an ArrayList to Array?
        Object[] array = listString.toArray();

        System.out.println("Converted Array : " + Arrays.toString(array));

        //using for loop
        //    for (Object a:array){
        //       System.out.println(a);
        //      }

        //How do you replace a particular element in an ArrayList with the given element?
        String set = listString.set(9, "11");
        System.out.println("Replaced value : " + set); //10
        System.out.println("Replaced the position :" + listString);


        //How do you retrieve a portion of an ArrayList? subList()

        List<String> subListStrings = listString.subList(4, 7);
        System.out.println("Sub list strings : " + subListStrings);


        //How do you join two ArrayLists?
        ArrayList<String> integerArrayList = new ArrayList<>();
        integerArrayList.add("11");
        integerArrayList.add("12");
        integerArrayList.add("13");
        integerArrayList.add("14");
        integerArrayList.add("15");
        integerArrayList.add("16");
        integerArrayList.add("17");
        integerArrayList.add("18");
        integerArrayList.add("19");
        integerArrayList.add("20");


        listString.addAll(integerArrayList);
        System.out.println("Join two arrayList :" + listString);

        //how to add two arrayList into another arrayList
        ArrayList<String> combine = new ArrayList<>();
        combine.addAll(listString);
        combine.addAll(integerArrayList);
        System.out.println("Added into 3rd arrayList: " + combine);


        //How do you remove all elements of an ArrayList at a time?
        listString.clear();
        System.out.println("Removed all the element at a time :" + listString);

        // Convert the arrays to ArrayLists
        String[] fruits = {"Apple", "Orange", "Banana", "Mango"};
        String[] fruit = {"Apple", "Litchi", "Grapes", "Mango"};


        // Convert the arrays to ArrayLists
        List<String> list = new ArrayList<>(Arrays.asList(fruits));
        List<String> list1 = new ArrayList<>(Arrays.asList(fruit));

        // Combine both ArrayLists
        list.addAll(list1);

        // Print the combined ArrayList
        System.out.println("Combined List: " + list);
        List<String> list2 = list.stream().distinct().sorted().toList();
        System.out.println(list2);
    }
}
