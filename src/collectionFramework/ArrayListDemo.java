package collectionFramework;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    /*
    List is an Interface, ArrayList is a Class. ArrayList implements List
    ArrayList allow/hold duplicate value
    Array is Static but ArrayList is dynamic
    ArrayList follow insertion order
     */
    public void listPractice(){

        List<String> students = new ArrayList<>();

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

        boolean isNotEmptyAfterAdd = students.isEmpty();
        System.out.println("Empty after adding elements: "+isNotEmptyAfterAdd);

        int sizeAfterAdd = students.size();
        System.out.println("Size before add: "+sizeAfterAdd);

        //Get all students name
        System.out.println(students);

        //Get students name by Index
        System.out.println(students.get(4));

        String name = "Farzana";
        if(students.contains(name)){
            System.out.println("Index of Farzana is "+students.indexOf(name));
        }
        else{
            System.out.println("Farzana doesn't exists");
        }

        students.add("Rahim");
        students.add("Tashrif");

        System.out.println("After adding more data: "+students);

        students.remove(2);
        System.out.println("After deleting data: "+students);

        //Setting data at custom index
        students.set(0,"Arya");
        System.out.println("After setting data/value in custom index: "+students);

        //Sorting list
        Collections.sort(students);
        System.out.println("After sorting: "+students);

        //Shuffling
        Collections.shuffle(students);
        System.out.println("After shuffling: "+students);


    }

    public void listOfNumbers(){
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(20);
        number.add(70);
        number.add(80);

        System.out.println(number);

        int maxValue = Collections.max(number);
        System.out.println("Max value: "+maxValue);

        int minValue = Collections.min(number);
        System.out.println("Min value: "+minValue);

        for(int i =0; i<number.size(); i++){
            System.out.println(number.get(i));
        }


    }

    public static void main(String[] args) {

        ArrayListDemo obj = new ArrayListDemo();
        //obj.listPractice();
        obj.listOfNumbers();

        //testing Git and Github


    }
}
