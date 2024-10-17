import java.util.Scanner;

public class SimaPrueba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Crear el Scanner

        juego j = new juego();

        char direccion = 'S'; // Damos el valor N para que empiece desde el Norte
        char eleccion;

        // Presentación del juego
        System.out.println("************************************************");
        System.out.println("*                                              *");
        System.out.println("*      ¡Bienvenido a 'LA SIMA DE HIELO'!       *");
        System.out.println("*                                              *");
        System.out.println("************************************************");
        System.out.println("*                                              *");
        System.out.println("*    Un mundo helado y peligroso te espera.    *");
        System.out.println("*    ¡Prepárate para enfrentar los desafíos    *");
        System.out.println("*    de los oscuros pasadizos y los feroces    *");
        System.out.println("*    pingüinos mutantes!                       *");
        System.out.println("*                                              *");
        System.out.println("************************************************");

        // Bucle "while" mientras el jugador tenga vida y no haya eliminado a los 5 pingüinos
        while ((j.getVida() > 0 && (j.getPinguinos() < 5))) {
            System.out.println("\n--------------------------------------------");
            System.out.println("Tienes " + j.getVida() + " puntos de vida.");
            System.out.println("Has eliminado a " + j.getPinguinos() + " pingüinos.\n");

            // Obtener la dirección
            do {
                if (direccion == 'S') {
                    System.out.println("¿Qué dirección tomarás? ('S = Sur' 'E = Este' 'O = Oeste')");
                    direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                    j.setDireccion(direccion); // Guardamos la dirección en la clase
                } else if (direccion == 'E') {
                    System.out.println("¿Qué dirección tomarás? ('N = Norte' 'S = Sur' 'E = Este')");
                    direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                    j.setDireccion(direccion); // Guardamos la dirección en la clase
                } else if (direccion == 'O') {
                    System.out.println("¿Qué dirección tomarás? ('N = Norte' 'S = Sur' 'O = Oeste')");
                    direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                    j.setDireccion(direccion); // Guardamos la dirección en la clase
                } else if (direccion == 'N') {
                    System.out.println("¿Qué dirección tomarás? ('N = Norte' 'E = Este' 'O = Oeste')");
                    direccion = sc.nextLine().charAt(0);  // Guardamos la dirección en una variable
                    j.setDireccion(direccion); // Guardamos la dirección en la clase
                } else {
                    System.out.println("Error. Dirección no válida.");
                }
            } while (direccion != 'S' && direccion != 'E' && direccion != 'O' && direccion != 'N');

            // Mostrar la dirección
            switch (j.getDireccion()) {
                case 'N':
                    System.out.println("Te diriges al Norte.\n");
                    break;
                case 'S':
                    System.out.println("Te diriges al Sur.\n");
                    break;
                case 'E':
                    System.out.println("Te diriges al Este.\n");
                    break;
                case 'O':
                    System.out.println("Te diriges al Oeste.\n");
                    break;
                default:
                    System.out.println("Dirección no válida.\n");
                    break;
            }

            // Generar el tamaño del pingüino
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
                    if (dado > j.getTamaño()) {
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