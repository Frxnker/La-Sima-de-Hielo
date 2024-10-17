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
    void setT(int tamaño) {
        t = tamaño;
    }

    void setV(int vida) {
        v = vida;
    }

    void setD(int dado) {
        d = dado;
    }

    void setP(int puntos) {
        p = puntos;
    }

    void setDireccion(char direccion) {
        D = direccion;
    }

    void setEleccion(char eleccion) {
        e = eleccion;
    }

    void setPinguinos(int pinguinos) {
        P = pinguinos;
    }

    // Métodos getters
    public int getTamaño() {
        t = (int)(Math.random() * 5) + 1; // El tamaño será un número aleatorio entre 1 y 5
        return t;
    }

    public int getVida() {
        return v; // La vida ya está definida como 50 en el constructor
    }

    public int getDado() {
        d = (int)(Math.random() * 6) + 1; // El dado será un número aleatorio entre 1 y 6
        return d;
    }

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

    public char getDireccion() {
        return D;
    }

    public char getEleccion() {
        return e;
    }

    public int getPinguinos() {
        return P;
    }
}
