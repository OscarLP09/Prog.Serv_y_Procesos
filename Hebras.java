public class Hebras extends Thread { // Clase donde declaramos las variables
    private final char letra;
    private final int veces;

    public Hebras(char letra, int veces) { // Constructor que recibe las variables anteriores
        this.letra = letra;
        this.veces = veces;
    }
    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.println(letra);
        }
        System.out.println(); // Para dejar una línea al final de cada hebra
    }
}
