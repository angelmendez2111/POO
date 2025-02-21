package ejercicios.movimiento;

class Jugador {
    private int fila;
    private int columna;
    private int limiteFila;
    private int limiteColumna;

    public Jugador(int filaInicial, int columnaInicial, int limiteFila, int limiteColumna) {
        this.fila = filaInicial;
        this.columna = columnaInicial;
        this.limiteFila = limiteFila;
        this.limiteColumna = limiteColumna;
    }

    public void mover(String direccion) {
        switch (direccion.toLowerCase()) {
            case "arriba":
                if (fila > 0) {
                    fila--;
                } else {
                    System.out.println("¡No puedes subir más!");
                }
                break;
            case "abajo":
                if (fila < limiteFila - 1) {
                    fila++;
                } else {
                    System.out.println("¡No puedes bajar más!");
                }
                break;
            case "izquierda":
                if (columna > 0) {
                    columna--;
                } else {
                    System.out.println("¡No puedes ir más a la izquierda!");
                }
                break;
            case "derecha":
                if (columna < limiteColumna - 1) {
                    columna++;
                } else {
                    System.out.println("¡No puedes ir más a la derecha!");
                }
                break;
            default:
                System.out.println("Movimiento no válido.");
        }
    }

    public void mostrarPosicion() {
        System.out.println("Posición actual: (" + fila + ", " + columna + ")");
    }
}



