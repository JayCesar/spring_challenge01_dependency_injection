package org.jaycesar.challenge01_injecaodedependencia;

import org.jaycesar.challenge01_injecaodedependencia.entities.Order;
import org.jaycesar.challenge01_injecaodedependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class Challenge01InjecaoDeDependenciaApplication implements CommandLineRunner {

    @Autowired
    private OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(Challenge01InjecaoDeDependenciaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        do {
            Order order = receiveData(sc);
            printOrder(order);
        } while (checkMenuProcess(sc));

        System.out.println("Program completed successfully!");

        sc.close();
    }

    public Order receiveData(Scanner sc) {
        int code = sc.nextInt();
        double basicValue = sc.nextDouble();
        double discount = sc.nextDouble();
        return new Order(code, basicValue, discount);
    }

    public void printOrder(Order order) {
        System.out.printf("Pedido código %d%n", order.getCode());
        System.out.printf("Valor total R$ %.2f%n", orderService.total(order));
    }

    public boolean checkMenuProcess(Scanner sc) {
        System.out.print("Deseja continuar? (s/n) ");
        char replyInput = sc.next().charAt(0);
        return replyInput != 'n';
    }
}
