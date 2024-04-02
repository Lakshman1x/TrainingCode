package factory;

public class ApplePay implements PaymentGateway{

    @Override
    public void processPayment(){
        System.out.println("Payment gateway used : ApplePay" );
    }
}
