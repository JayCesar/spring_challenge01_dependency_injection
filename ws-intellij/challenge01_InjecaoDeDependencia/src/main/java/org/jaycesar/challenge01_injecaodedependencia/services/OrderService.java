package org.jaycesar.challenge01_injecaodedependencia.services;

import org.jaycesar.challenge01_injecaodedependencia.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        return (order.getBasic() + shippingService.shipment(order)) - (order.getBasic() * order.getDiscount() / 100);
    }

}
