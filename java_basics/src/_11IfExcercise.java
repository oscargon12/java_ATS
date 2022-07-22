//Pedir tres numeros y ordenarlos de mayor a menor
public class _11IfExcercise {
    public static void main(String[] args) {
        int numX = 17;
        int numY = 20;
        int numZ = 12;

        if((numX > numY) && (numY > numZ)){
            System.out.println(numX + " " + numY + " " + numZ);
        } else if((numX > numZ) && (numZ > numY)){
            System.out.println(numX + " " + numZ + " " + numY);
        } else if((numY > numX) && (numX > numZ)){
            System.out.println(numY + " " + numX + " " + numZ);
        } else if ((numY > numZ) && (numZ > numX)){
            System.out.println(numY + " " + numZ + " " + numX);
        } else if ((numZ > numX) && (numX > numY)) {
            System.out.println(numZ + " " + numX + " " + numY);
        } else{
            System.out.println(numZ + " " + numY + " " + numX);
        }
    }
}
