package scannerDemo;

import java.util.Scanner;

public class ScannerPractice {

    public static void myScanner(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your First Name: ");
        String myName = scan.nextLine();
        System.out.println("I'm reading my name from Console "+myName);

        System.out.println("Enter your street address: ");
        int myStreetAddress = scan.nextInt();
        System.out.println("My street address is "+myStreetAddress);

        System.out.println("Enter your cars mileage: ");
        short mileage = scan.nextShort();
        System.out.println("My cars mileage is "+mileage);

        System.out.println("Enter your cars engine number: ");
        long engNo = scan.nextLong();
        System.out.println("My cars engine number is "+engNo);

        System.out.println("Enter your cars height: ");
        float height = scan.nextFloat();
        System.out.println("My cars height is "+height);



    }


    public static void main(String[] args){

        myScanner();

    }




}
