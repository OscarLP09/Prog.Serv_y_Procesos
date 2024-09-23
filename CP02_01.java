public class CP02_01 {
    public static void main(String[] args) {
        // Crear 3 hebras con letras y veces
        Hebras h1 = new Hebras ('a', 5);
        Hebras h2 = new Hebras('b', 5);
        Hebras h3 = new Hebras('c', 5);
        // Iniciamos las hebras
        h1.start();
        h2.start();
        h3.start();
    }
}

/*
La salida de las letras podría mezclarse, ya que los hilos se ejecutan en paralelo, y el sistema operativo puede cambiar entre ellos
en cualquier momento. Esto depende de la planificación de hilos, que no es determinista.

Si se mezclan las letras, es porque los hilos están compitiendo por imprimir al mismo tiempo.
Puedes justificar este comportamiento diciendo que los hilos no están sincronizados, lo que puede resultar en la intercalación de caracteres.
 */