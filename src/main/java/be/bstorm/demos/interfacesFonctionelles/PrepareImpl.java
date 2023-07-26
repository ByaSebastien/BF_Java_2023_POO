package be.bstorm.demos.interfacesFonctionelles;

public class PrepareImpl implements CarwashHelper{
    @Override
    public void execute(Voiture v) {
        System.out.println("Je prepare la voiture " + v.getNumero());
    }
}
