package factory;

public class PayPal implements  PaymentGateway {
    @Override
    public  void processPayment(){
        System.out.println("Payment gateway used : Paypal");
    }

}
