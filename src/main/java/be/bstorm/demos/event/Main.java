package be.bstorm.demos.event;

public class Main {

    public static void main(String[] args) {

        Catalog catalog = new Catalog();
        Car car = new Car("RAM","Dodge");
        NotifyNewCarSubscriber<Car> sub1 = new MySubInutile();
        catalog.addSubscriber(sub1);
        NotifyNewCarSubscriber<Car> sub2 = new NotifyNewCarSubscriber<Car>() {
            @Override
            public void execute(Car entity) {
                System.out.println("Je suis deja un peu moin inutile! " + car.getMarque());
            }
        };
        catalog.addSubscriber(sub2);

        NotifyNewCarSubscriber<Car> sub3 = (c) -> System.out.println("Je suis génial!!!");

        Car car2 = new Car("206","Peugeot");

        catalog.addSubscriber(sub3);
        catalog.addSubscriber((c) -> System.out.println(c.getMarque() + " " + car2.getModele() + " vient d'être ajouté au catalog!"));



        catalog.addCar(car);
    }
}
