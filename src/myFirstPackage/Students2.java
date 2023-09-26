package myFirstPackage;

public class Students2 {


    public static void main(String[] args){


        System.out.println(Students.schoolName);
        //Students.study(); //does not work for method which is not static

        Students obj3 = new Students();

        obj3.study();
        obj3.exam();
    }













}
