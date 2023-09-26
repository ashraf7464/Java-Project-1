package arrayDemo;

public class ArrayPractice {

    static String [] name = {"Ashraf", "Bushra", "Tashrif", "Delwar"};


    public static void arrayDemo(){

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);
        System.out.println(name[3]);

        int lengthOfArray = name.length;
        System.out.println(lengthOfArray);

        for(int i=0; i<name.length; i++){
            System.out.println(name[i]);

        }

        for(String studentName:name){
            System.out.println(studentName);
        }


    }

    public static void main(String[] args) {

        arrayDemo();
    }
}
