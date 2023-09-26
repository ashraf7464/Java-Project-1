package oopConcept.polymorphismDemo;

public class MethodOverloadingDemo {

    /**
     * This method is for Website login
     * @param userName
     * @param password
     */
    public void login(String userName, String password){

        System.out.println("Website login");
    }

    /**
     * This method is for Credit Card account login
     * @param userName
     * @param pin
     * @param password
     */
    public void login(String userName, int pin, String password){

        System.out.println("Credit card account login");
    }

    /**
     * This method is for Database login
     * @param userName
     * @param dataBasePin
     * @param authenticationPin
     */
    public void login(String userName, int dataBasePin, int authenticationPin){

        System.out.println("Database login");
    }


    public static void main(String[] args) {

        MethodOverloadingDemo obj = new MethodOverloadingDemo();

        obj.login("ashraf7464","ash1234");
        obj.login("ashraf7464", 1234,"ash1234");
        obj.login("ashraf1234",6677,885667);
    }



}