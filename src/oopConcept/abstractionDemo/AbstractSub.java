package oopConcept.abstractionDemo;

public class AbstractSub extends AbstractSuper{


    // This class is for implementation
    @Override
    public void placeOrder() {
        super.cardDetails();
        System.out.println(customerName);
        System.out.println(customerCardNo);
        System.out.println(cardExpDate);
        System.out.println(cardCVV);
        System.out.println("sending the info to bank database");
    }

    @Override
    public void reduceBalance() {

        System.out.println("Reduce balance from account");
    }

    public static void main(String[] args) {

        AbstractSub obj = new AbstractSub();

        obj.placeOrder();
        obj.reduceBalance();
    }
}
