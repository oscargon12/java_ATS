import java.util.Scanner;

public class _16ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Decremento");
        for (int j = 10; j >= 0; j--) {
            System.out.println(j);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el limite");

        int userCounter = Integer.parseInt(sc.nextLine());
        printCounter(userCounter);
    }

    public static void printCounter(int counter) {

        for (int x = 0; x <= counter; x++) {
            System.out.println(x);
        }
    }
}
