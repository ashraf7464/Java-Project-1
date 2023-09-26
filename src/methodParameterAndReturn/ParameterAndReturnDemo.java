package methodParameterAndReturn;

public class ParameterAndReturnDemo {


    public void add(int x, int y) {

//        int x = 1;
//        int y = 2;
        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);

    }

    public int substract(int a, int b){
        int c = a+b;
        int d = c;
        return d;

    }

    public String studentName(String name) {

        return name;
    }

    public static void main(String[] args) {

        ParameterAndReturnDemo obj = new ParameterAndReturnDemo();
        obj.add(3,4);
        System.out.println("--------------------------------------");
        obj.add(5,6);
        System.out.println("--------------------------------------");

        int newValue = obj.substract(20,5);
        System.out.println(newValue);

        String myName = obj.studentName("Ashraf");
        System.out.println(myName);

    }















}
