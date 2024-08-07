package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.LinkedList;

public class CollectionFramework {

    public static void main(String[] args) {
        // retrieve objects in ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Grapes");
        arrayList.add("Kiwi");

        System.out.println("ArrayList:");
        for (String fruit : arrayList) {
            System.out.println(fruit);
        }

        // Storing and retrieve object in Vector
        Vector<String> vector = new Vector<>();
        vector.add("Dog");
        vector.add("Cat");
        vector.add("tiger");

        System.out.println("\nVector:");
        for (String animal : vector) {
            System.out.println(animal);
        }

        // retrieve object in LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Gauri");
        linkedList.add("Bhand");
        linkedList.add("Suchitra");

        System.out.println("\nLinkedList:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        // function to convert array of objects to List
        String[] array = {"One", "Two", "Three"};
        List<String> list = arrayToList(array);

        System.out.println("\nList from array:");
        for (String element : list) {
            System.out.println(element);
        }
    }

    //convert array of objects to List
    public static <T> List<T> arrayToList(T[] array) {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
}
