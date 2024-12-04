package com.example.orderCalculator;

import com.example.orderCalculator.entities.Order;
import com.example.orderCalculator.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrderCalculatorApplication implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(OrderCalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.00, 20.0);
		printOrder(order1);

		Order order2 = new Order(2282, 800.00, 10.0);
		printOrder(order2);

		Order order3 = new Order(1309, 95.90, 0.0);
		printOrder(order3);
	}

	private void printOrder(Order order) {
		double total = orderService.total(order);
		System.out.println("Pedido código " + order.getCode());
		System.out.printf("Valor total: R$ %.2f%n%n", total);
	}
}
