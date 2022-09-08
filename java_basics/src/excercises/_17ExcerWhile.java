//Leer un numero, indicar si es positivo  o negativo, hasta que se introduzca 0
package excercises;

import java.util.Scanner;

public class _17ExcerWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int inputNum = Integer.parseInt(sc.nextLine());
        calcZero(inputNum);
    }

    public static void calcZero(int userNum) {

        while (userNum != 0) {
            if (userNum < 0) {
                System.out.println("El numero es negativo");
            } else if (userNum > 0) {
                System.out.println("El numero es positivo");
            }
            System.out.println("Ingresa otro numero");

        }
    }
}
