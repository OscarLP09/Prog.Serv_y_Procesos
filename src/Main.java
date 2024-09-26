public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Crear una instancia de VariableCompartida
        VariableCompartida variable = new VariableCompartida();
        variable.setV(0);  // Inicializar el valor de v a 0

        // Crear dos hilos (hebras) que compartan la misma instancia de VariableCompartida
        Thread t1 = new Thread(new Hebra(variable));
        Thread t2 = new Thread(new Hebra(variable));

        // Iniciar los hilos
        t1.start();
        t2.start();

        // Esperar a que ambos hilos terminen
        t1.join();
        t2.join();

        // Mostrar el valor final de la variable v
        System.out.println("Valor final de v: " + variable.getV());
    }
}
