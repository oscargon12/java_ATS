import javax.swing.JOptionPane; //Libreria necesaria para la ventana emergente

public class _4InterfaceInputOutput {
    public static void main(String[] args) {
        // String cadena;
        int entero;
        // char letra;
        // double decimal;

        // ** Pidiendo datos por interfaz **
        // cadena = JOptionPane.showInputDialog("Digite una cadena: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: ")); // Integer.parseInt parsea
        // letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0); //
        // charAt(0) apunta a la primera letra
        // decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal:
        // "));

        // ** Imprimiendo datos por interfaz **
        JOptionPane.showMessageDialog(null, "El numero es: " + entero);
    }
}
