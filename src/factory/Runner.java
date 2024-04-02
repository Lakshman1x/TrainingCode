package factory;

public class Runner {
    public static  void main(String[] args){
        PaymentGatewayFactory factory = new PaymentGatewayFactory();

        PaymentGateway google = factory.create(GooglePay.class);
        google.processPayment();
        PaymentGateway paypal = factory.create(PayPal.class);
        paypal.processPayment();
        PaymentGateway apple=factory.create(ApplePay.class);
        apple.processPayment();


    }
}
