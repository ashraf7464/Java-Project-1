package myFirstPackage;

public class Cars {

    byte wheel;
    short mileage;
    int regNo;
    long engineNo;
    float height;
    double length;
    boolean isEV;
    char modelNo;
    String color;

    public void movementOfVehicle(){
        
        System.out.println("Car can move forward or backward");
    }

    public void changingGear(){

        System.out.println("Gear can be changed frequently in Car");
    }

    public static void main(String[] args){

        Cars myCar = new Cars();

        myCar.wheel=4;
        myCar.mileage=31000;
        myCar.regNo = 4534567;
        myCar.engineNo = 1864768264;
        myCar.height = 4.64f ;
        myCar.length = 6.45678;
        myCar.isEV= false;
        myCar.modelNo = 'N';
        myCar.color = "Black";

        myCar.movementOfVehicle();
        myCar.changingGear();
        System.out.println();

        Cars hisCar = new Cars();

        hisCar.wheel=4;
        hisCar.mileage=29000;
        hisCar.regNo = 4535554;
        hisCar.engineNo = 1861118264;
        hisCar.height = 4.89f ;
        hisCar.length = 6.1112;
        hisCar.isEV= true;
        hisCar.modelNo = 'T';
        hisCar.color = "Red";

        hisCar.movementOfVehicle();
        hisCar.changingGear();
        System.out.println();

        System.out.println("Total number of wheels of my car is: " +myCar.wheel);
        System.out.println("Total mileage of my car is: " +myCar.mileage);
        System.out.println("Registration number of my car is: " +myCar.regNo);
        System.out.println("Engine number of my car is: " +myCar.engineNo);
        System.out.println("Height of my car is: " +myCar.height);
        System.out.println("Length of my car is: " +myCar.length);
        System.out.println("My car is an electric vehicle: " +myCar.isEV);
        System.out.println("My car Model number starts with: " +myCar.modelNo);
        System.out.println("The color of my car is: " +myCar.color);

    }
}
