class Hebra extends Thread {
    private VariableCompartida variable;

    // Constructor que recibe la variable compartida y el nombre de la hebra
    public Hebra(VariableCompartida variable) {
        this.variable = variable;
    }

    @Override
    public void run() {
        // Incrementar el valor de v 10 veces
        for (int i = 0; i < 10; i++) {
            variable.inc();  // Incrementa la variable compartida

            // Imprimir el valor de v después de cada incremento
            System.out.println("La Hebra incrementa: v = " + variable.getV());

            try {
                // Añadir un pequeño retardo para que sea más fácil ver los incrementos
                Thread.sleep(100);  // 100 milisegundos de pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
