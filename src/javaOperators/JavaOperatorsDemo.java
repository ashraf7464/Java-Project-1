package javaOperators;

public class JavaOperatorsDemo {

    //Arithmetic
    //Relational
    //Logical Operator
    //Assignment Operator

    public static void arithmeticOperator(){

        int a = 20;
        int b = 9;
        int result;

        result = a+b;
        System.out.println(result);

        result = a-b;
        System.out.println(result);

        result = a*b;
        System.out.println(result);

        float fraction = (float)a/b;    //type casting
        System.out.println(fraction);

        byte wheels = 4;
        short x = wheels;
        System.out.println(x);

        short regNo = 32767;
        byte y = (byte)regNo; // forcing to change data type, but it will not give accurate output
        System.out.println(y);
    }

    public static void relationalOperators(){
        int a =20;
        int b = 9;
        boolean result = false;

        result = a>b;
        System.out.println(result);

        result = a<b;
        System.out.println(result);

        result = a>=b;
        System.out.println(result);

        result = a!=b;
        System.out.println(result);
    }

    public static void logicalOperators(){
        int a =20;
        int b = 9;
        int c = 5;
        boolean result;

        boolean result1 = (a>b) && (b<c);
        System.out.println(result1);

        boolean result2 = (b<a) || (a>c);
        System.out.println(result2);

    }

    public static void main(String[] args){

//        JavaOperatorsDemo obj = new JavaOperatorsDemo();
//        obj.arithmeticOperator();
        arithmeticOperator();
        relationalOperators();
        logicalOperators();
    }













}
