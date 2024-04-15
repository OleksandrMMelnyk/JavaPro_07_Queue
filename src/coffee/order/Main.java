package coffee.order;

public class Main {
    public static void main(String[] args) {

        CoffeeOrderBoard orderBoard = new CoffeeOrderBoard();

        orderBoard.add("Oksana");
        orderBoard.add("Margo");
        orderBoard.add("Oleksii");
        orderBoard.add("Ruslan");
        orderBoard.add("Klim");
        orderBoard.add("Svitlana");
        orderBoard.add("Maksym");
        orderBoard.add("Iryna");

        orderBoard.draw();

        orderBoard.deliver();
        orderBoard.deliver(5);
        orderBoard.deliver(3);
        orderBoard.deliver(1);
        orderBoard.deliver(5);
        orderBoard.deliver(2);

        orderBoard.draw();
    }
}