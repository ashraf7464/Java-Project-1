package oopConcept.abstractionDemo;

public abstract class AbstractSuper {
    // Abstract is a process to hide implementation and showing only functionality
    // Abstract Class can't be instantiated
    // Abstract Class can be 0%-100% abstraction

    String customerName;
    int customerCardNo;
    int cardExpDate;
    int cardCVV;


    public abstract void placeOrder();

    public abstract void reduceBalance();

    public void cardDetails(){

        customerName="Ashraf";
        customerCardNo= 11223344;
        cardExpDate = 1224;
        cardCVV = 765;

    }

    public void moreCardDetails(){

        cardDetails();
    }

    public static void main(String[] args) {
       // AbstractSuper obj = new AbstractSuper(); //Can't create object for Abstract Class
    }
}
