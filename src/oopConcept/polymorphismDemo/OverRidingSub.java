package oopConcept.polymorphismDemo;

public class OverRidingSub extends OverRidingSuper{

    @Override

    public void UprightCourse(){

        super.UprightCourse();
        int classPerWeek = 3;
        String batchName = "Batch-6";
        String classType = "Online";

        System.out.println("Name of this batch is "+batchName);
        System.out.println("Class type of this batch is "+classType);


    }

    public static void main(String[] args) {

        OverRidingSub obj = new OverRidingSub();

        obj.UprightCourse();
    }


}
