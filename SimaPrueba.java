import java.util.Scanner;

public class SimaPrueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear el Scanner

        juego j = new juego();

        char direccion = ' '; // Damos el valor N para que empiece desde el Norte
        char eleccion;

        // Presentación del juego
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*       ¡Bienvenido a 'LA SIMA DE HIELO'!       *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*     Un mundo helado y peligroso te espera.    *");
        System.out.println("*     ¡Prepárate para enfrentar los desafíos    *");
        System.out.println("*     de los oscuros pasadizos y los feroces    *");
        System.out.println("*     pingüinos mutantes!                       *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        System.out.println("*                                               *");
        System.out.println("*               Reglas del Juego                *");
        System.out.println("*                                               *");
        System.out.println("*  1. Si huyes: Se te restará un punto de vida. *");
        System.out.println("*  2. Si luchas: Se tirará un dado de 6 caras.  *");
        System.out.println("*      - XS: Vence con 2, 3, 4, 5 o 6.          *");
        System.out.println("*      - S: Vence con 3, 4, 5 o 6.              *");
        System.out.println("*      - M: Vence con 4, 5 o 6.                 *");
        System.out.println("*      - L: Vence con 5 o 6.                    *");
        System.out.println("*      - XL: Solo se vence con 6.               *");
        System.out.println("*  3. Si el explorador vence, gana puntos de    *");
        System.out.println("*     vida dependiendo del tamaño del pingüino. *");
        System.out.println("*     - XS: Entre 1 y 10 puntos (al azar).      *");
        System.out.println("*     - S: Entre 10 y 20 puntos (al azar).      *");
        System.out.println("*     - M: Entre 20 y 30 puntos (al azar).      *");
        System.out.println("*     - L: Entre 30 y 40 puntos (al azar).      *");
        System.out.println("*     - XL: Entre 40 y 50 puntos (al azar).     *");
        System.out.println("*                                               *");
        System.out.println("*************************************************");
        

        // Bucle "while" mientras el jugador tenga vida y no haya eliminado a los 5 pingüinos
        while ((j.getVida() > 0 && (j.getPinguinos() < 5))) {
            System.out.println("\n--------------------------------------------");
            System.out.println("Tienes " + j.getVida() + " puntos de vida.");
            System.out.println("Has eliminado a " + j.getPinguinos() + " pingüinos.\n");

            // Obtener la dirección
            do {
                if (direccion == ' ') {
                    do {
                        System.out.println("¿Qué dirección tomarás? ('S = Sur' 'E = Este' 'O = Oeste')");
                        direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                        System.out.println("Te diriges al Norte.\n");
                    } while (direccion != 'S' && direccion != 'E' && direccion != 'O');
                } else if (direccion == 'S') {
                    do {
                        System.out.println("¿Qué dirección tomarás? ('S = Sur' 'E = Este' 'O = Oeste')");
                        direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                        System.out.println("Te diriges al Sur.\n");
                    } while (direccion != 'S' && direccion != 'E' && direccion != 'O');
                } else if (direccion == 'E') {
                    do {
                        System.out.println("¿Qué dirección tomarás? ('N = Norte' 'S = Sur' 'E = Este')");
                        direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                        System.out.println("Te diriges al Este.\n");
                    } while (direccion != 'S' && direccion != 'E' && direccion != 'N');
                } else if (direccion == 'O') {
                    do {
                        System.out.println("¿Qué dirección tomarás? ('N = Norte' 'S = Sur' 'O = Oeste')");
                        direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                        System.out.println("Te diriges al Oeste.\n");
                    } while (direccion != 'S' && direccion != 'O' && direccion != 'N');
                } else if (direccion == 'N') {
                    do {
                        System.out.println("¿Qué dirección tomarás? ('S = Sur' 'E = Este' 'O = Oeste')");
                        direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                        System.out.println("Te diriges al Norte.\n");
                    } while (direccion != 'S' && direccion != 'E' && direccion != 'O');
                } else {
                    System.out.println("Dirección no válida.");
                }

                j.setDireccion(direccion); // Guardamos la dirección en la clase

            } while (direccion != 'S' && direccion != 'E' && direccion != 'O' && direccion != 'N');

            // Generar el tamaño del pingüino
            int tamaño = j.getTamaño();
            switch (j.getTamaño()) {
                case 1:
                    System.out.println("Ha aparecido un pingüino de tamaño: XS");
                    break;
                case 2:
                    System.out.println("Ha aparecido un pingüino de tamaño: S");
                    break;
                case 3:
                    System.out.println("Ha aparecido un pingüino de tamaño: M");
                    break;
                case 4:
                    System.out.println("Ha aparecido un pingüino de tamaño: L");
                    break;
                case 5:
                    System.out.println("Ha aparecido un pingüino de tamaño: XL");
                    break;
            }

            // Dibujamos el pingüino
            System.out.println("              . --- .");
            System.out.println("            /        \\");
            System.out.println("           |  O  _  O |");
            System.out.println("           |  ./   \\. |");
            System.out.println("           /  `-._.-'  \\");
            System.out.println("         .' /         \\ `.");
            System.out.println("     .-~.-~/           \\~-.~-.");
            System.out.println(" .-~ ~    |             |    ~ ~-.");
            System.out.println(" `- .     |             |     . -'");
            System.out.println("      ~ - |             | - ~");
            System.out.println("          \\             /   ");
            System.out.println("        ___\\           /___");
            System.out.println("        ~;_  >- . . -<  _i~");
            System.out.println("           `'         `'");

            // Pedir elección del jugador
            do {
                System.out.println("¿Qué harás? ('A = Atacar' 'H = Huir')");
                eleccion = sc.nextLine().charAt(0); // Guardamos la elección en una variable
                j.setEleccion(eleccion); // Guardamos la elección en la clase
            } while (eleccion != 'A' && eleccion != 'H');

            // Mostrar la acción del usuario y la resolución de la batalla
            switch (j.getEleccion()) {
                case 'A':
                    System.out.println("Has decidido atacar al pingüino.");
                    int dado = j.getDado(); // Tirar el dado
                    System.out.println("Tiraste un dado y obtuviste un: " + dado);
                    // Si el número del dado es mayor que el tamaño del pingüino, ganas
                    if (dado > tamaño) {
                        System.out.println("¡Has derrotado al pingüino!");
                        int p = j.getPuntos(); // Obtener los puntos
                        System.out.println("Has ganado " + p + " puntos de vida.");
                        j.setV(j.getVida() + p); // Aumentar la vida del jugador
                        j.setPinguinos(j.getPinguinos() + 1); // Aumentar el número de pingüinos eliminados
                    } else {
                        System.out.println("¡El pingüino te ha atacado!");
                        int p = j.getPuntos(); // Obtener los puntos
                        System.out.println("Has perdido " + p + " puntos de vida.");
                        j.setV(j.getVida() - p); // Reducir la vida del jugador
                    }
                    break;
                case 'H':
                    System.out.println("Has decidido huir del pingüino.");
                    j.setV(j.getVida() - 1); // Si huyes, pierdes 1 punto de vida
                    System.out.println("Pierdes 1 punto de vida por huir.");
                    break;
                default:
                    System.out.println("Elección no válida.");
                    break;
            }
        }

        // Mostrar el resultado final
        System.out.println("\n--------------------------------------------");
        // Si el jugador ha eliminado a los 5 pingüinos
        if (j.getPinguinos() == 5) {
            System.out.println("¡Has eliminado a los 5 pingüinos!");
            System.out.println("Has sobrevivido con " + j.getVida() + " puntos de vida.");
            System.out.println("¡Has escapado de la sima de hielo!");
        } 
        // Si el jugador ha perdido todos los puntos de vida
        else {
            System.out.println("¡Has perdido todos tus puntos de vida!");
            System.out.println("¡Has sido derrotado por los pingüinos!");
            System.out.println("Total de pingüinos eliminados: " + j.getPinguinos());
        }

        sc.close(); // Cerrar el Scanner
        System.out.println("¡Gracias por jugar a 'LA SIMA DE HIELO'!\n");
        
        System.out.println("    /\\_/\\           ___");
        System.out.println("   = o_o =_______    \\ \\  ");
        System.out.println("    __^      __(  \\.__) )");
        System.out.println("(@)<_____>__(_____)____/");
    }
}