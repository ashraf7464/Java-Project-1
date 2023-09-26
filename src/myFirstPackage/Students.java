package myFirstPackage;

public class Students {

    String name;
    int studentID;
    char gender;
    String group;
    static String schoolName = "Upright Tech Solution";

    public void study(){

        String location;
        location = "USA";
        System.out.println("Students study to prepare homework");

    }

    public void exam(){
        int zipCode;
        zipCode= 11432;
        System.out.println("Student prepare for the exam");
    }

    public static void main(String[] args){

        Students obj = new Students();

        obj.name= "Ashraf";
        obj.studentID= 100;
        obj.gender= 'M';
        obj.group= "Selenium";


        obj.study();
        obj.exam();

        System.out.println("------------------------------------");

        Students obj2 = new Students();

        obj2.name= "Farzana";
        obj2.studentID= 103;
        obj2.gender= 'F';
        obj2.group= "Java";

        obj2.study();
        obj2.exam();
    }










}
