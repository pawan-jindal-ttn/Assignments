package Ques6;

import java.util.Scanner;

public class OrderManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "Choose the status\n" +
                        "PENDING\n\tPROCESSING\n\tSHIPPED\n\tDELIVERED\n\tCANCELLED\n\tREFUNDED "
        );
        String orderStatus = input.nextLine();

        String message = switch(orderStatus){
            case "PENDING" -> OrderStatus.PENDING.getStatus();
            case "PROCESSING" -> OrderStatus.PROCESSING.getStatus();
            case "SHIPPED" -> OrderStatus.SHIPPED.getStatus();
            case "DELIVERED" -> OrderStatus.DELIVERED.getStatus();
            case "CANCELLED" -> OrderStatus.CANCELLED.getStatus();
            case "REFUNDED" -> OrderStatus.REFUNDED.getStatus();
            default -> {
                yield "Please enter correct status";
            }
        };
        System.out.println("Order Status: " + message);
    }
}
