package excercises;

import java.util.Scanner;

public class _7Excercises2 {
    public static void main(String[] args) {
        double salary = 1000;
        double bonus = 150;
        double carPrice = 0;
        double sumatoriaCars = 0;

        Scanner userInputs = new Scanner(System.in);
        System.out.println("Cuantos carros ha vendido el vendedor?");
        int sellCarsAmount = userInputs.nextInt();

        if (sellCarsAmount > 0) {
            System.out.println("El vendedor ha vendido " + sellCarsAmount + " carros");
            for (int i = 0; i < sellCarsAmount; i++) {
                System.out.println("Ingresa el precio del " + (i + 1) + " carro");
                carPrice = userInputs.nextDouble();
                sumatoriaCars += carPrice;
            }
        } else {
            System.out.println("El vendedor no ha concretado ninguna venta");
        }
        System.out.println("El total de los carros vendidos es: " + sumatoriaCars);
        double sellBonus = (sumatoriaCars * 5) / 100;
        System.out.println("El 5% de los carros vendidos es: " + sellBonus);
        double totalBonus = bonus * sellCarsAmount;
        System.out.println("El bono por cada carro vendido es: " + totalBonus);

        double finalSalary = salary + sellBonus + totalBonus;
        System.out.println("El salario final es: " + finalSalary);
    }
}
