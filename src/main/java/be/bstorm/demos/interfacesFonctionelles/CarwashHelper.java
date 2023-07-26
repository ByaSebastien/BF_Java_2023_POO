package be.bstorm.demos.interfacesFonctionelles;

public interface CarwashHelper {

    void execute(Voiture v);
    default void demo() {
        System.out.println("demo");
    }
}
