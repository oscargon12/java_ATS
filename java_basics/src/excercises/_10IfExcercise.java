package excercises;

import java.util.Scanner;

//Algoritmo que tome dos numeros y diga si ambos son pares o impares

public class _10IfExcercise {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double number1 = Integer.parseInt(userInput.nextLine());
        System.out.println("Ingrese el segundo numero");
        double number2 = Integer.parseInt(userInput.nextLine());

        pairCalc(number1, number2);
    }

    // Funcion que calcula
    public static void pairCalc(double num1, double num2) {

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Ambos numeros son pares");
        } else if (num1 % 2 == 0 && num2 % 2 != 0) {
            System.out.println("Solo el primer numero es par");
        } else if (num1 % 2 != 0 && num2 % 2 == 0) {
            System.out.println("Solo el segundo numero es par");
        } else {
            System.out.println("Ningun numero es par");
        }
    }
}
