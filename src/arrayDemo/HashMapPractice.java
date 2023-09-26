package arrayDemo;

import java.util.HashMap;

public class HashMapPractice {

      /*
    Map is an Interface, HashMap is a Class. HashMap implements Set
    HashSet allow/hold two data types
    HashMap store data as Key/Value pairs
    HashSet doesn't follow insertion order
     */

    public void hashMapDemo(){

        HashMap<Integer,String> cars = new HashMap<>();

        cars.put(1,"Toyota");
        cars.put(2,"Chevy");
        cars.put(3,"BMW");
        cars.put(4,"KIA");
        cars.put(5,"Honda");
        cars.put(6,"BMW");


        System.out.println(cars);

        System.out.println(cars.get(4));

        cars.remove(5);


    }

    public static void main(String[] args) {

        HashMapPractice obj = new HashMapPractice();
        obj.hashMapDemo();

    }
}
