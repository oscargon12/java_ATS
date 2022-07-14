public class _5Operators {
    public static void main(String[] args) {
        int num = 10;
        num += 5;
        System.out.println("El nuevo numero es: " + num);

        // Incremento y decremento
        int x = 1;
        x++;

        int y = 5;
        y--;

        int z = y++; // Sigue dando 5 porque el aumento lo hace despues
        int a = ++y; // Ahora si da 6 porque el incremento lo hace antes

        // Funciona igual con decremento

    }
}
