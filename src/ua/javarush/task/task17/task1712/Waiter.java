package ua.javarush.task.task17.task1712;

public class Waiter implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        Manager manager = Manager.getInstance();

        while (continueWorking || !manager.getDishesQueue().isEmpty()) {
            if (!manager.getDishesQueue().isEmpty()) {       // відносить готове замовлення
                Dishes dishes = manager.getDishesQueue().poll();
                System.out.println("Офіціант відніс замовлення для столу №" + dishes.getTableNumber());
            } else {                                         // беремо нове замовлення
                Table table = manager.getNextTable();
                Order order = table.getOrder();
                System.out.println("Отримано замовлення від столу №" + order.getTableNumber());
                manager.getOrderQueue().add(order);
            }
            try {
                Thread.sleep(100);  // walking to the next table
            } catch (InterruptedException e) {
            }
        }
    }
}
