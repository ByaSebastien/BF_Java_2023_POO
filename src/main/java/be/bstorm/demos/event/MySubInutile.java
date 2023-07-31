package be.bstorm.demos.event;

public class MySubInutile implements NotifyNewCarSubscriber<Car>{
    @Override
    public void execute(Car entity) {
        System.out.println("Je suis completement inutile!!!");
    }
}
