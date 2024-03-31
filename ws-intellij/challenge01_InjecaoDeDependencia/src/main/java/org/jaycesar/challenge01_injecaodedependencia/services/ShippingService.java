package org.jaycesar.challenge01_injecaodedependencia.services;

import org.jaycesar.challenge01_injecaodedependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    private final double TAX_SHIPMENT_100 = 20.00;
    private final double TAX_SHIPMENT_100_AND_200 = 12.00;
    private final double BASIC_VALUE_100 = 100.00;
    private final double BASIC_VALUE_200 = 200.00;

    public double shipment(Order order) {
        if (order.getBasic() < BASIC_VALUE_100) return TAX_SHIPMENT_100;
        else if (order.getBasic() > BASIC_VALUE_100 && order.getBasic() < BASIC_VALUE_200)
            return TAX_SHIPMENT_100_AND_200;
        else return 0.0;
    }
}
