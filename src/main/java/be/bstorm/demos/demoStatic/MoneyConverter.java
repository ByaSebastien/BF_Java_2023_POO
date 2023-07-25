package be.bstorm.demos.demoStatic;

public final class MoneyConverter {

    public static double EuroToDollar(double amount){
        return amount * 1.1087;
    }

    public static double DollarToEuro(double amount){

        return amount * 0.9020;
    }
}
