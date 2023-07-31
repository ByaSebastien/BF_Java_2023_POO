package be.bstorm.demos.event;

public interface NotifyNewCarSubscriber<T> {

    void execute(T entity);
}
