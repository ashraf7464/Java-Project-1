package oopConcept.encapsulationDemo;

public class EncapsulationDemo2 {


    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();

        obj.SSN1=123456;
       // obj.SSN=133456; //Can't be used when the variable SSN is private

        obj.setSSN(12121212);
        int mySSN = obj.getSSN();
        System.out.println(mySSN);
    }
}
