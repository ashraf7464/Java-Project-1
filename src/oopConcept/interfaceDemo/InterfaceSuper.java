package oopConcept.interfaceDemo;

public interface InterfaceSuper {

    /*
    Interface is similar to Abstraction Class hiding implementation showing only functionality
    Interface is 100% abstraction, it can't have a non-abstract method
    In Interface all variables are final by default
     */

    String customerName="Ashraf";
    int customerCardNo= 11223344;
    int cardExpDate = 1224;
    int cardCVV = 765;

    public void placeOrder();

    public void reduceBalance();
}
