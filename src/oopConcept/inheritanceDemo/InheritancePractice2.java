package oopConcept.inheritanceDemo;

public class InheritancePractice2 extends InheritancePractice{


    String state;
    int zipCode;

    public void welcome(){
        System.out.println("Welcome to USA");
    }

    public static void main(String[] args) {

        InheritancePractice2 obj = new InheritancePractice2();

        obj.name="Ashraf";
        obj.location="Texas";

        obj.hello();

    }


}
