package ua.javarush.task.task17.task1712;

public class Cook implements Runnable {
    public boolean continueWorking = true;

    @Override
    public void run() {
        boolean needToWait;
        while (continueWorking || needToCookOrders()) {
            try {
                synchronized (this) {
                    needToWait = !needToCookOrders();
                    if (!needToWait) {
                        cook();
                    }
                }
                if (continueWorking && needToWait) {
                    System.out.println("Кухар відпочиває");
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    private boolean needToCookOrders() {
        return !Manager.getInstance().getOrderQueue().isEmpty();
    }

    private void cook() throws InterruptedException {
        Manager manager = Manager.getInstance();
        Order order = manager.getOrderQueue().poll();      // кухар бере замовлення з черги
        System.out.println(String.format("Замовлення готуватиметься %d мс для столу №%d", order.getTime(), order.getTableNumber()));
        Thread.sleep(order.getTime());     // готуємо страву
        Dishes dishes = new Dishes(order.getTableNumber());       // це готова страва
        manager.getDishesQueue().add(dishes);
        System.out.println(String.format("Замовлення для столу №%d готове", dishes.getTableNumber()));
    }
}
