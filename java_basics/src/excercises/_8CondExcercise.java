package excercises;

//Comprobar si un caracter ingresado es mayus o minus
import java.util.Scanner;

public class _8CondExcercise {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingresa una letra");
        char userLetter = userInput.nextLine().charAt(0);
        isMayus(userLetter);
    }

    // Función que calcula
    public static void isMayus(char letter) {

        if (Character.isUpperCase(letter)) {
            System.out.println("La letra SI es mayuscula");
        } else {
            System.out.println("La letra NO es mayuscula");
        }
    }
}
