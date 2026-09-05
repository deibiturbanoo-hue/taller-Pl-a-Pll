import java.util.Scanner;

/**
 * Ejercicio 3: Invertir una cadena de texto.
 * Recibe una cadena ingresada por el usuario y la muestra invertida.
 */
public class InvertirCadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = teclado.nextLine();

        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida += texto.charAt(i);
        }

        System.out.println("Cadena invertida: " + invertida);

        teclado.close();
    }
}