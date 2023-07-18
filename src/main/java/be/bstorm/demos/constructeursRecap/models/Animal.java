package be.bstorm.demos.constructeursRecap.models;

public class Animal {

    //region Attributs

    private String name;
    private int size;
    private int weight;

    //endregion

    //region constructeurs
    public Animal(String paramName, int paramWeight, int paramSize){
        this.name = paramName;
        this.weight = paramWeight;
        this.size = paramSize;
    }
    //endregion

    //region Propriétés
    public String getName() {
        String result = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        return result;
    }

    public void setName(String name) {
        if(name.trim().equals("")){
            return;
        }
        this.name = name;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size <= 0){
            return;
        }
        this.size = size;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        if(weight <= 0){
            return;
        }
        this.weight = weight;
    }

    //endregion

    //region Méthodes

    public void nourir(String aliment){
//        System.out.println(getName() + " mange 1 " + aliment);
        nourir(aliment,1);
    }

    // Surcharge (overload) de la methode nourir(String aliment)
    public void nourir(String aliment,int quantite){
        System.out.println(getName() + " mange " + quantite + " " + aliment);
    }

    public void crier(){
        System.out.println("Je sais pas encore ce que je suis!");
    }

    @Override
    public String toString() {
        return  "\nname='" + name + '\'' +
                "\nsize=" + size +
                "\nweight=" + weight;
    }

    //endregion
}
