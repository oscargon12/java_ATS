public class _14WhileLoop {
    public static void main(String[] args) {
        int i = 1;

        // El while valida la condicion, antes de ejecutar el codigo, a diferencia del
        // do while
        System.out.println("Incremento");
        while (i <= 10) {
            System.out.println(i);
            i++; // hay que incrementar en cada iteracion
        }

        int j = 10;
        System.out.println("Decremento");
        while (j >= 1) {
            System.out.println(j);
            j--; // hay que decrementar en cada iteracion
        }
    }
}
