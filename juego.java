public class juego {
    
    private int t;
    private int v;
    private int d;
    private int p;
    private char D;
    private char e;
    private int P = 0;

    // Constructor
    juego() {
        t = 0;
        v = 50;
        d = 0;
        p = 0;
        D = ' ';
        e = ' ';
        P = 0;
    }

    // Métodos setters

    public void setT(int tamaño) {
        t = tamaño;
    }

    public void setV(int vida) {
        v = vida;
    }

    public void setD(int dado) {
        d = dado;
    }

    public void setP(int puntos) {
        p = puntos;
    }

    public void setDireccion(char direccion) {
        D = direccion;
    }

    public void setEleccion(char eleccion) {
        e = eleccion;
    }

    public void setPinguinos(int pinguinos) {
        P = pinguinos;
    }

    // Métodos getters
    // El tamaño será un número aleatorio entre 1 y 5
    public int getTamaño() {
        t = (int)(Math.random() * 5) + 1;
        return t;
    }

    // La vida ya está definida como 50 en el constructor
    public int getVida() {
        return v;
    }

    // El dado será un número aleatorio entre 1 y 6
    public int getDado() {
        d = (int)(Math.random() * 6) + 1; 
        return d;
    }

    // Método para obtener los puntos
    public int getPuntos() {
        switch (t) {
            case 1:
                p = (int)(Math.random() * 10) + 1;
                break;
            case 2:
                p = (int)(Math.random() * 10) + 10;
                break;
            case 3:
                p = (int)(Math.random() * 10) + 20;
                break;
            case 4:
                p = (int)(Math.random() * 10) + 30;
                break;
            case 5:
                p = (int)(Math.random() * 10) + 40;
                break;
        }
        return p;
    }

    // Método para obtener la dirección
    public char getDireccion() {
        return D;
    }

    // Método para obtener la elección
    public char getEleccion() {
        return e;
    }
    
    // Método para obtener el número de pingüinos eliminados
    public int getPinguinos() {
        return P;
    }
}