
public class Hebras extends Thread {
    private final char letra;
    private final int veces;

    public Hebras(char letra, int veces) {
        this.letra = letra;
        this.veces = veces;
    }
    @Override
    public void run() {
        for (int i = 0; i < veces; i++) {
            System.out.println(letra);
        }
        System.out.println(); // Para dejar una linea al final de cada hebra
    }
}
