package finalKeyword;

    /*
    Final variable can't be modified later
    Final method can't be overridden
    Final class can't be extended
     */
public class FinalSuper {

    String name ="Ashraf";
    final String state ="New York";

    public void UprightTechSolution(){

        String mode = "Online";


    }


    public static void main(String[] args) {
        FinalSuper obj = new FinalSuper();

        obj.name="Bashir";
       // obj.state="Texas"; //Can't be updated when keyword final is used

        System.out.println(obj.name);
        System.out.println(obj.state);
    }
}
