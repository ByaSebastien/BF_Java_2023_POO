package be.bstorm.demos.heritage;

public class Voiture extends Vehicule{

    private int nbRoues;

    public int getNbRoues() {
        return nbRoues;
    }

    public void setNbRoues(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    @Override
    public void seDeplacer(){

//        super.seDeplacer();
        System.out.println("Je roule en voiture");
    }

    @Override
    public String toString() {
        return super.toString() + "Voiture{" +
                "nbRoues=" + nbRoues +
                '}';
    }
}
