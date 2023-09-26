package accessModifier;

public class AModifier_1 {

    public int minute = 60;
    private int hour = 24;
    String day = "Sunday";
    protected String month = "January";

    public void printMinute(){
        System.out.println("Public AccessModifier");
    }

    private void printHour(){
        System.out.println("Private AccessModifier");
    }

    void printDay(){
        System.out.println("PackagePrivate AccessModifier");
    }

    protected void printMonth(){
        System.out.println("Protected AccessModifier");
    }

    public static void main(String[] args) {
        AModifier_1 obj = new AModifier_1();

        System.out.println(obj.minute);
        System.out.println(obj.hour);
        System.out.println(obj.day);
        System.out.println(obj.month);
        System.out.println("--------------------");
        obj.printMinute();
        obj.printHour();
        obj.printDay();
        obj.printMonth();
    }
}
