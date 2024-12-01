/**
 *Proyecto de investigacion de el 1er Bimestre
 *@author Pablo Velez
 */
import java.util.Random;
import java.util.Scanner;
public class AdivinarUnNumero2_0 {
    public static void main(String[] args) {
        // Generar el número secreto aleatorio entre 1 y 100
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;

        int intentosMaximos = 10; // Máximo número de intentos
        int intentosRealizados = 0; // Contador de intentos realizados
        Scanner scanner = new Scanner(System.in); // Entrada del usuario

        // Mensaje de bienvenida
        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Debes adivinar un número entre 1 y 100.");
        System.out.println("Tienes " + intentosMaximos + " intentos. ¡Buena suerte!");

        // Ciclo principal del juego
        while (intentosRealizados < intentosMaximos) {
            // Solicitar al usuario que adivine el número
            System.out.print("Adivina el número: ");
            int intentoUsuario = scanner.nextInt(); // Leer el intento del usuario
            intentosRealizados++; // Incrementar el contador de intentos

            // Verificar si el usuario adivinó el número
            if (intentoUsuario == numeroSecreto) {
                System.out.println("¡Felicidades! Has adivinado el número en " + intentosRealizados + " intentos.");
                break; // Salir del ciclo
            }

            // Dar pistas al usuario
            System.out.println("Pista:");
            if (intentoUsuario < numeroSecreto) {
                System.out.println("- El número secreto es mayor que " + intentoUsuario + ".");
            } else {
                System.out.println("- El número secreto es menor que " + intentoUsuario + ".");
            }
            if (numeroSecreto % 2 == 0) {
                System.out.println("- El número secreto es par.");
            } else {
                System.out.println("- El número secreto es impar.");
            }

            // Comprobar si el número es primo
            boolean esPrimo = true;
            if (numeroSecreto < 2) {
                esPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numeroSecreto); i++) {
                    if (numeroSecreto % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }
            if (esPrimo) {
                System.out.println("- El número secreto es primo.");
            } else {
                System.out.println("- El número secreto no es primo.");
            }

            // Informar los intentos restantes
            System.out.println("Te quedan " + (intentosMaximos - intentosRealizados) + " intentos.");

            // Si el usuario agota los intentos
            if (intentosRealizados == intentosMaximos) {
                System.out.println("Lo siento, has perdido. El número secreto era: " + numeroSecreto);
            }
        }

        // Mensaje de despedida
        System.out.println("Gracias por jugar. ¡Hasta la próxima!");
    }
}

/*                                       
¡Bienvenido al juego de adivinar el número!            
Debes adivinar un número entre 1 y 100.             
Tienes 10 intentos. ¡Buena suerte!                  
Adivina el número: 12                               
Pista:                                              
- El número secreto es mayor que 12.                
- El número secreto es impar.                       
- El número secreto no es primo.                    
Te quedan 9 intentos.                               
Adivina el número: 45                               
Pista:                                              
- El número secreto es mayor que 45.                
- El número secreto es impar.                       
- El número secreto no es primo.                    
Te quedan 8 intentos.                               
Adivina el número: 67                               
Pista:                                              
- El número secreto es menor que 67.                
- El número secreto es impar.                       
- El número secreto no es primo.                    
Te quedan 7 intentos.                               
Adivina el número: 55                               
Pista:                                              
- El número secreto es menor que 55.                
- El número secreto es impar.                       
- El número secreto no es primo.                    
Te quedan 6 intentos.                               
Adivina el número: 47                               
Pista:                                              
- El número secreto es mayor que 47.                
- El número secreto es impar.                       
- El número secreto no es primo.                    
Te quedan 5 intentos.                               
Adivina el número: 49                               
¡Felicidades! Has adivinado el número en 6 intentos.
Gracias por jugar. ¡Hasta la próxima!               
*/