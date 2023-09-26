package accessModifier;

public class AModifier_2 extends AModifier_1 {


    public static void main(String[] args) {

        AModifier_2 obj = new AModifier_2();


        System.out.println(obj.minute);
        //System.out.println(obj.hour);    private can't be accessible from another class
        System.out.println(obj.day);
        System.out.println(obj.month);
        System.out.println("--------------------");
        obj.printMinute();
        //obj.printHour();                  private can't be accessible from another class
        obj.printDay();
        obj.printMonth();

    }
}
