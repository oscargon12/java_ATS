import java.util.Scanner;

public class _15DoWhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // El do while ejecuta almenos una vez el codigo y despues valida la condicion
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un numero");
        int userCounter = Integer.parseInt(sc.nextLine());

        printCounter(userCounter);
    }

    public static void printCounter(int counter) {
        int j = 0;

        do {
            System.out.println(j);
            j++;
        } while (j <= counter);
    }
}
