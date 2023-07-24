package be.bstorm.demos.exception;

public class Main {

    public static void main(String[] args) {

        try {
            MathOperator.Division(9,2 );
            System.out.println("Succeed");
        }catch (DividedByZeroException ex){
            System.out.println("Catch de l'exception");
            System.out.println(ex.getMessage());
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("Finito");
    }
}
