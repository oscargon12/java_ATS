import java.util.Scanner;

public class _8IfConditional {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double salary = 1000;
        double bonus = 100;
        double totalBonus = 0;
        double totalSalary = 0;

        System.out.println("Ingresa el número de carros vendidos");
        // int carsSelled = userInput.nextInt();
        int carsSelled = Integer.parseInt(userInput.nextLine());

        if (carsSelled > 0) {
            totalBonus = carsSelled * bonus;
            totalSalary = salary + totalBonus;
            System.out.println("Vendio " + carsSelled + " carros, el salario es " + totalSalary);
        } else {
            totalSalary = salary + totalBonus;
            System.out.println("No vendió ningun carro, el salario es " + totalSalary);
        }
    }
}
