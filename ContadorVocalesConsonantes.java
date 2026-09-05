import java.util.Scanner;

/**
 * Ejercicio 2: Contador de vocales y consonantes.
 * Recibe una palabra en minusculas, sin tildes, simbolos ni numeros,
 * y cuenta cuantas vocales y consonantes tiene.
 */
public class ContadorVocalesConsonantes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese una palabra (sin acentos, numeros ni simbolos): ");
        String palabra = teclado.nextLine();

        int vocales = 0;
        int consonantes = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            } else if (letra >= 'a' && letra <= 'z') {
                consonantes++;
            }
        }

        System.out.println("Numero de vocales: " + vocales);
        System.out.println("Numero de consonantes: " + consonantes);

        teclado.close();
    }
}

