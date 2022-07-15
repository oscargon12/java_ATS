public class _6ClassMath {
    public static void main(String[] args) {
        double num = 36;

        // ** Raiz cuadrada **
        double numRoot = Math.sqrt(num); // Esta es la sintaxis de raiz cuadrada, es mejor dejarla double
        System.out.println(numRoot);

        // ** Exponencia **
        double base = 5, exponent = 2;
        double expResult = Math.pow(base, exponent);
        System.out.println(expResult);

        // ** Round **
        // float decimalNum = 4.56f;
        // int roundNum = Math.round(decimalNum);

        double decimalNum = 4.56;
        long roundNum = Math.round(decimalNum);
        System.out.println(roundNum);

        // ** Random **
        // Da un numero decimal aleatorio entre 0 y 1
        double randomNum = Math.random();
        System.out.println(randomNum);
    }
}
