package controlFlowStatements;

import java.util.Scanner;

public class IfElseStatement {

    //Conditional Statement i. condition, ii. block
    /*There are few types of conditional statements
        i. If Statement
        ii. If Else
        iii. If Else Ladder
        iv. Nested If Else
     */

    int a = 2;
    int b = 4;
    int c = 7;

    public void ifStatement(){

        if (a==2){
            System.out.println("a is equal to 2");
            System.out.println("--------------------");
        }
    }


    public void ifElseStatement(){

        if (a==1) {
            System.out.println("a is equal to 1");
            System.out.println("--------------------");
        }
        else {
            System.out.println("a is not equal to 1");
            System.out.println("--------------------");
        }

        if(b%2==0) {
            System.out.println("b is an even number");
            System.out.println("--------------------");
        }
        else{
            System.out.println("b is a odd number");
        }

    }

    public void ifElseLadder(){
//        int a = 2;
//        int b = 4;
//        int c = 7;

        Scanner scan = new Scanner(System.in);

        System.out.println("Print your first number");
        int a = scan.nextInt();
        System.out.println("Print your second number");
        int b = scan.nextInt();
        System.out.println("Print your third number");
        int c = scan.nextInt();

        if((a>b) && (b<c)){
            System.out.println("a>b and b<c");

        }
        else if ((a>c) || (c<b)) {
            System.out.println("a>c or c<b");
        }
        else if ((a+b<c) && (a>b)) {
            System.out.println("a+b<c and a>b");
        }
        else{
            System.out.println("Nothing matches");
        }

    }

    public void nestedIfElseStatement(){

        if((a>b) && (b<c)){
            System.out.println("a>b and b<c");

        }
        else if ((a>c) || (c<b)) {
            System.out.println("a>c or c<b");
        }
        else if ((a+b<c) && (a>b)) {
            System.out.println("a+b<c and a>b");
        }
        else{
            if((a>b) && (b<c)){
                System.out.println("a>b and b<c");

            }
            else if ((a>c) || (c<b)) {
                System.out.println("a>c or c<b");
            }
            else if ((a+b<c) && (a>b)) {
                System.out.println("a+b<c and a>b");
            }
            else{
                System.out.println("Nothing matches");
            }
        }
    }

    public static void main(String[] args){

        IfElseStatement obj = new IfElseStatement();
//        obj.ifStatement();
//        obj.ifElseStatement();
//        obj.ifElseLadder();
        obj.nestedIfElseStatement();
    }

}
