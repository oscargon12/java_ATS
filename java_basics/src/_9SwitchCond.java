import java.util.Scanner;

public class _9SwitchCond {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int userNum;
        System.out.println("Ingresa un numero entre 1 y 5");
        userNum = Integer.parseInt(userInput.nextLine());

        // El metodo switch evalua varias posibilidades
        switch (userNum) {
            case 1:
                System.out.println("Ingreso el numero " + userNum);
                break; // El break es obligatorio, permite salir de la condicion, si el caso se cumple
            case 2:
                System.out.println("Ingreso el numero " + userNum);
                break;
            case 3:
                System.out.println("Ingreso el numero " + userNum);
                break;
            case 4:
                System.out.println("Ingreso el numero " + userNum);
                break;
            case 5:
                System.out.println("Ingreso el numero " + userNum);
                break;
            default:
                System.out.println("No ingresó ningún numero entre 1 y 5");
        }
    }
}
