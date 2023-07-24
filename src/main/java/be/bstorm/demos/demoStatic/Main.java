package be.bstorm.demos.demoStatic;
import static be.bstorm.demos.demoStatic.MoneyConverter.Converter.*;

public class Main {

    public static void main(String[] args) {

        double euro = 42;
        System.out.println(euro + "€");
        double dollar = EuroToDollar(euro);
        euro = DollarToEuro(dollar);

        System.out.println(dollar + "$");
        System.out.println(euro + "€");

//        for(double i = 0.0; i < 10.0; i+= 0.01){
//            System.out.println(i);
//        }

        Movie m1 = new Movie("Gladiator");
        Movie m2 = new Movie("Braveheart");
        Movie m3 = new Movie("Oppenheimer");


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println(Movie.currentId);
    }
}