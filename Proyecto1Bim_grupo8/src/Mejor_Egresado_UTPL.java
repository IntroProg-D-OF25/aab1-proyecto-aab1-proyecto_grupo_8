/**
 *Proyecto de investigacion de el 1er Bimestre
 * @author Pablo Velez
 */
import java.util.Random;
public class Mejor_Egresado_UTPL {
      public static void main(String[] args) {
        // Número de estudiantes a generar
        int numeroEstudiantes = 10;

        // Arreglo para guardar los nombres y promedios de los estudiantes
        String[][] estudiantes = new String[numeroEstudiantes][2];

        // Generador de datos aleatorios
        Random random = new Random();

        // Arreglo con nombres ficticios para los estudiantes
        String[] nombresFicticios = {
            "Juan", "Ana", "Luis", "María", "Pedro",
            "Lucía", "Carlos", "Sofía", "Miguel", "Laura"
        };

        // Llenar el arreglo con nombres y promedios aleatorios
        for (int i = 0; i < numeroEstudiantes; i++) {
            estudiantes[i][0] = nombresFicticios[random.nextInt(nombresFicticios.length)]; // Nombre aleatorio
            // Generar promedio entre 5.00 y 10.00 usando punto decimal
            double promedioAleatorio = 5 + random.nextDouble() * 5;
            estudiantes[i][1] = String.format("%.2f", promedioAleatorio).replace(',', '.'); // Reemplazar comas por puntos
        }

        // Variables para almacenar los dos mejores promedios y sus índices
        double max1 = 0, max2 = 0; // Promedios más altos
        int indexMax1 = -1, indexMax2 = -1; // Índices de los mejores promedios

        // Ciclo para encontrar los dos mejores promedios
        for (int i = 0; i < estudiantes.length; i++) {
            double promedio = Double.parseDouble(estudiantes[i][1]);

            if (promedio > max1) {
                // Actualizamos el segundo lugar antes de modificar el primero
                max2 = max1;
                indexMax2 = indexMax1;

                // Actualizamos el primer lugar
                max1 = promedio;
                indexMax1 = i;
            } else if (promedio > max2) {
                // Si el promedio es menor que el primero pero mayor que el segundo
                max2 = promedio;
                indexMax2 = i;
            }
        }

        // Imprimir la lista de todos los estudiantes
        System.out.println("Lista de estudiantes:");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Nombre: " + estudiantes[i][0] + ", Promedio: " + estudiantes[i][1]);
        }

        // Mostrar los dos mejores egresados
        System.out.println("\nMejor(es) egresado(s):");

        if (indexMax1 != -1) {
            System.out.println("1er Lugar - Nombre: " + estudiantes[indexMax1][0] + ", Promedio: " + estudiantes[indexMax1][1]);
        }
        if (indexMax2 != -1) {
            System.out.println("2do Lugar - Nombre: " + estudiantes[indexMax2][0] + ", Promedio: " + estudiantes[indexMax2][1]);
        }
    }
}
/*
Lista de estudiantes:
Nombre: Ana, Promedio: 9.43
Nombre: Laura, Promedio: 9.51
Nombre: Carlos, Promedio: 9.56
Nombre: Luis, Promedio: 8.10
Nombre: Sofía, Promedio: 8.99
Nombre: María, Promedio: 7.30
Nombre: Lucía, Promedio: 7.35
Nombre: Luis, Promedio: 7.58
Nombre: Sofía, Promedio: 5.14
Nombre: Miguel, Promedio: 6.17

Mejor(es) egresado(s):
1er Lugar - Nombre: Carlos, Promedio: 9.56
2do Lugar - Nombre: Laura, Promedio: 9.51
*/