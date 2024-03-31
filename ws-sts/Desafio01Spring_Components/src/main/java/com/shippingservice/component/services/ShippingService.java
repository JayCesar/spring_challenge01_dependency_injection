package com.shippingservice.component.services;

import org.springframework.stereotype.Service;

import com.shippingservice.component.entities.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		if (order.getBasic() < 100.0) return 20.0;
		else if(order.getBasic() >= 100.0 && order.getBasic() <= 200.0) return 12.00;
		else return 0.0;
	}
	
}
