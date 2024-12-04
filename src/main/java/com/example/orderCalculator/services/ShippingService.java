package com.example.orderCalculator.services;

import com.example.orderCalculator.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(Order order) {
        return order.getBasic() < 100.0 ? 20.0 :
                order.getBasic() < 200.0 ? 12.0 : 0.00;
    }
}
