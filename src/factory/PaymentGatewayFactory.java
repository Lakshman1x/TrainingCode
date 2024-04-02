package factory;

import java.util.HashMap;
import java.util.Map;

public class PaymentGatewayFactory {
    Map<Class<?>,PaymentGateway> map = new HashMap<>(new FactoryConfig().map);

    public PaymentGateway create(Class<?> gateway){
        return map.get(gateway);
    }
}
