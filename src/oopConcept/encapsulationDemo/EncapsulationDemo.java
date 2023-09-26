package oopConcept.encapsulationDemo;

public class EncapsulationDemo {

    public int SSN1;
    private int SSN;

    private String name;


    public int getSSN() {

        return SSN1;
    }

    public void setSSN(int SSN1) {
        this.SSN1 = SSN1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();

    }

}
