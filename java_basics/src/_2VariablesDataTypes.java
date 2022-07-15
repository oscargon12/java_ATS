public class _2VariablesDataTypes {
    public static void main(String[] args) {
        // Primitivos
        byte enteroXs = 12; // Pesa 8 bits, (desde -128 ▶️ hasta 127)
        short entero = 12456; // Pesa 16 bits, (-32,768 ▶️ -32,767)
        int enteroLg = 1245656; // Pesa 32 bits desde (-2,147,483,648 ▶️ 2,147'483,647)
        long enteroXl = 1245656565; // Pesa 64 bits (-9,223,372,036,854,775,808 ▶️ 9,223,372,036,854,775,807)
        float decimal = 3.45f;// Pesa 32 bits necesita una 'f' al final del numero
        double decimal2 = 3.42344; // Pesa 64 bits, no necesita 'f' al final, puede ocupar mucha memoria
        char caracter = 'a'; // con comilla simple
        boolean isUser = true;
        // el valor null no cabe en datos primitivos, (no se podría: int num = null)

        // Compuestos
        Integer numero = 10;
        Integer numEmpty = null; // Los compuestos si reciben null
        String words = "Hello world"; // No se puede comilla simple, ya que son para char

        // CONSTANTES
        final int fixedNum = 10; // las constantes se definen con el prefijo (final) antes del tipo de variable
        // fixedNum = 15; sería error, ya que no se puede cambiar

        System.out.println("Numero entero pequeño " + enteroXs);
        System.out.println("Numero entero " + entero);
        System.out.println("Numero entero grande " + enteroLg);
        System.out.println("Numero entero XL " + enteroXl);
    }
}
