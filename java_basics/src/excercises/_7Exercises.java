package excercises;

import java.util.Scanner;

public class _7Exercises {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        System.out.println("Cuantas horas trabajas a la semana");
        double hours = inputs.nextDouble();

        System.out.println("Cuanto cuesta tu hora de trabajo");
        double hourCost = inputs.nextDouble();

        double weeklyPay = hours * hourCost;
        System.out.println(weeklyPay);
    }
}
