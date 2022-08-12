//programa que pase de Kg a otra unidad de masa, mostrar menú con opciones

import java.util.Scanner;

public class _13Exercise {

    Scanner sc = new Scanner(System.in);

    // double unitKilogram = 0;
    public double calcWeight() {
        double unitKilogram = Double.parseDouble(sc.nextLine());

        return 12;
    }

    public static void main(String[] args) {
        System.out.println("Selecciona la unidad a la que quieres convertir");
        System.out.println(" 1. Tonelada \n 2. Hectogramo \n 3. Decagramo \n 4. Gramo");
    }
}
