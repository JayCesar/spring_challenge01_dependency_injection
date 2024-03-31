package com.shippingservice.component;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.shippingservice.component.entities.Order;
import com.shippingservice.component.services.OrderService;


@SpringBootApplication
public class ComponentApplication implements CommandLineRunner{
	
	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ComponentApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		printOrder();
	}
	
	public Order inputOrder() {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDigite o código: ");
		Integer code = sc.nextInt();
		System.out.print("\nDigite o valor básico: ");
		Double basic = sc.nextDouble();
		System.out.print("\nDigite o percentual de desconto: ");
		Double discount = sc.nextDouble();
		Order order = new Order(code, basic, discount);
		return order;
	}
	
	public void printOrder() {
		Order order = inputOrder();
		System.out.printf("\nPedido código: %d", order.getCode());
		System.out.printf("\nValor total: %.2f", orderService.total(order));
	}

	
}
