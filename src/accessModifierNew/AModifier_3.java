package accessModifierNew;

import accessModifier.AModifier_1;

public class AModifier_3 extends AModifier_1 {


    public static void main(String[] args) {

        AModifier_3 obj = new AModifier_3();

        System.out.println(obj.minute);
        //System.out.println(obj.hour);    private can't be accessible from another class
        //System.out.println(obj.day);     PackagePrivate can't be accessible from a Class in another Package
        System.out.println(obj.month);
        System.out.println("--------------------");
        obj.printMinute();
        //obj.printHour();                 private can't be accessible from another class
        //obj.printDay();                  PackagePrivate can't be accessible from a Class in another Package
        obj.printMonth();
    }
}
