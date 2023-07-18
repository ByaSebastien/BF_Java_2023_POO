package be.bstorm.demos.constructeursRecap.models;

public class Herbivore extends Animal{

    //region Attributs

    private String region;

    //endregion

    //region Constructeurs

    public Herbivore(String name,int weight, int size, String paramRegion){
        super(name,weight,size);
        this.region = paramRegion;
    }

    //endregion

    //region Propriétés

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }


    //endregion

    //region Méthodes

    @Override
    public String toString() {
        return super.toString() + "\nregion='" + region ;
    }


    //endregion
}
