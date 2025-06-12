import java.util.Random;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    int numeroSecreto = rand.nextInt(100) + 1;
                    int intento = 0;
                    int contador = 0;
                    System.out.println("Adivina el número secreto entre 1 y 100:");
                    do {
                        System.out.print("Introduce tu intento: ");
                        intento = scanner.nextInt();
                        contador++;
                        if (intento < numeroSecreto) {
                            System.out.println("Demasiado bajo. Intenta de nuevo.");
                        } else if (intento > numeroSecreto) {
                            System.out.println("Demasiado alto. Intenta de nuevo.");
                        } else {
                            System.out.println("¡Felicidades! Has adivinado el número en " + contador + " intentos.");
                        }
                    } while (intento != numeroSecreto);
                    break;
                case 2:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 2);
        scanner.close();
    }
}
