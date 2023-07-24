package be.bstorm.demos.exception;

public class MathOperator {

    public static int Division(int a, int b) {

        if(b == 0){
            throw new DividedByZeroException(); // pas de params
//            throw new DividedByZeroException("Erreur!"); // avec param
        }
        if(a % 2 != 0){
            throw new ArithmeticException("Je divise pas les nombres impairs");
        }
        return a / b;
    }
}
