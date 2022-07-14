import java.util.Scanner; //Libreria necesaria

public class _3InputsOutputs {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); // instancia requerida para el input

        int num;
        System.out.println("Ingresa un numero ");
        num = entrada.nextInt();
        System.out.println("El numero es: " + num);

        float numFloat;
        System.out.println("Ingresa un numero decimal "); // Este se recibe con ,
        numFloat = entrada.nextFloat();
        System.out.println("El numero es decimal: " + numFloat);

        double numDouble;
        System.out.println("Ingresa un numero decimal "); // Este se recibe con ,
        numDouble = entrada.nextDouble();
        System.out.println("El numero es decimal: " + numDouble);

        String cadena;
        System.out.println("Ingrese una frase");
        cadena = entrada.next(); // El next solo toma la primera palabra hasta el espacio
        System.out.println("La frase es: " + cadena);

        String cadena2;
        System.out.println("Ingrese otra frase");
        cadena2 = entrada.nextLine(); // Reconoce todas las palabras
        System.out.println("La frase es: " + cadena2);

        char letra;
        System.out.println("Ingrese una letra");
        letra = entrada.next().charAt(0);
        System.out.println("La letra es: " + letra);
    }
}
