package factory;

import java.util.HashMap;
import java.util.Map;

public class FactoryConfig {
    Map<Class<?>, PaymentGateway> map = new HashMap<>();
    FactoryConfig(){
        map.put(ApplePay.class, new ApplePay());
        map.put(GooglePay.class,new GooglePay());
        map.put(PayPal.class,new PayPal());

    }

}
