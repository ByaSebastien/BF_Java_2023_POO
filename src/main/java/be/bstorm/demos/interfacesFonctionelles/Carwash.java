package be.bstorm.demos.interfacesFonctionelles;

import java.util.ArrayList;
import java.util.List;

public class Carwash {

    private List<CarwashHelper> commands;

    public Carwash() {
        this.commands = new ArrayList<>();
//        commands.add(v -> System.out.println("Je prepare la voiture " + v.getNumero()));
//        commands.add(v -> this.lave(v));
//        commands.add(this::finalise);
    }

    public void addSubscriber(CarwashHelper carwashHelper){

        commands.add(carwashHelper);
    }

    private void prepare(Voiture v) {
        System.out.println("Je prepare la voiture " + v.getNumero());
    }

    private void lave(Voiture v) {
        System.out.println("Je lave la voiture " + v.getNumero());
    }

    private void finalise(Voiture v) {
        System.out.println("Je finalise la voiture " + v.getNumero());
    }

    public void traiter(Voiture v) {


        for (CarwashHelper c : commands) {
            c.execute(v);
        }
    }
}
