package be.bstorm.demos.event;

public class Car {

    private String modele;
    private String marque;

    public Car(String modele, String marque) {
        this.modele = modele;
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }
}
