package factory;

public class GooglePay implements  PaymentGateway{
    @Override
    public  void processPayment(){
        System.out.println("Payment gateway used : GooglePay");
    }
}
