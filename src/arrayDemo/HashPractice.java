package arrayDemo;

import collectionFramework.ArrayListDemo;

import java.util.HashSet;
import java.util.Set;

public class HashPractice {

     /*
    Set is an Interface, HashSet is a Class. HashSet implements Set
    HashSet doesn't allow/hold duplicate value
    Array is Static but ArrayList is dynamic
    HashSet doesn't follow insertion order
     */

    public void hashSetDemo() {

        Set<String> students = new HashSet<>();

        boolean isEmptyBeforeAdd = students.isEmpty();
        System.out.println("Empty before adding elements: "+isEmptyBeforeAdd);

        int sizeBeforeAdd = students.size();
        System.out.println("Size before add: "+sizeBeforeAdd);

        students.add("Ashraf");
        students.add("Tarek");
        students.add("Farzana");
        students.add("Ashraf");
        students.add("Rubaiya");
        students.add("Neel");
        students.add("John");
        students.add("Jenifer");

        System.out.println(students);



    }
    public static void main (String[]args){

        HashPractice obj = new HashPractice();
        obj.hashSetDemo();
    }
}
