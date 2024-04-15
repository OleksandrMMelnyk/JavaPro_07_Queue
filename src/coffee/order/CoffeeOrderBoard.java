package coffee.order;

import java.util.LinkedList;
import java.util.Deque;


public class CoffeeOrderBoard {
    final Deque<Order> orders;
    private int orderCounter = 0;

    public CoffeeOrderBoard() {
        orders = new LinkedList<>();
    }

    public void add(String clientName) {
        orderCounter++;
        Order arriveOrder = new Order(orderCounter, clientName);
        orders.offer(arriveOrder);
    }

    public void deliver() {
        reportDelivery(orders.poll());
    }

    public void deliver(int orderNumber) {
        for (Order order : orders) {
            if (order.getOrderNumber() == orderNumber) {
                orders.removeFirstOccurrence(order);
                reportDelivery(order);
                return;
            }
        }
        reportDelivery(null);
    }

    public void reportDelivery(Order deliveredOrder) {
        if (deliveredOrder == null) {
            System.out.println("There are no orders.");
            return;
        }
        System.out.println("Issuance of order # " + deliveredOrder.getOrderNumber() + " for " + deliveredOrder.getClientName() + "!");
    }

    public void draw() {
        System.out.println("\nNum | Name");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getClientName());
        }
        System.out.println();
    }
}
