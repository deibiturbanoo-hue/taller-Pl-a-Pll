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

        // Uso StringBuilder en vez de concatenar con + dentro del for,
        // porque es mas eficiente: evita crear un String nuevo en cada vuelta del bucle.
        StringBuilder invertida = new StringBuilder();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertida.append(texto.charAt(i));
        }

        System.out.println("Cadena invertida: " + invertida);

        teclado.close();
    }
}