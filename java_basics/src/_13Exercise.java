//programa que pase de Kg a otra unidad de masa, mostrar menú con opciones

import java.util.Scanner;

public class _13Exercise {

    static Scanner sc = new Scanner(System.in);

    // double unitKilogram = 0;
    public static void calcWeight(double unitKilogram, int option) {
        // double unitKilogram = Double.parseDouble(sc.nextLine());

        switch (option) {
            case 1:
                System.out.println(unitKilogram + " kilos " + " son " + (unitKilogram / 1000) + " toneladas");
                break;
            case 2:
                System.out.println(unitKilogram + " kilos " + " son " + (unitKilogram / 0.1) + " hectogramos");
                break;
            case 3:
                System.out.println(unitKilogram + " kilos " + " son " + (unitKilogram / 0.01) + " decagramos");
                break;
            case 4:
                System.out.println(unitKilogram + " kilos " + " son " + (unitKilogram / 0.001) + " gramos");
                break;
            default:
                System.out.println("No ingresaste una opción valida");
        }

    }

    public static void main(String[] args) {
        System.out.println("Selecciona la unidad a la que quieres convertir");
        System.out.println(" 1. Tonelada \n 2. Hectogramo \n 3. Decagramo \n 4. Gramo");
        int option = Integer.parseInt(sc.nextLine());

        System.out.println("Ingresa el peso en kilogramos");
        double unitKilogram = Double.parseDouble(sc.nextLine());

        calcWeight(unitKilogram, option);
    }
}
