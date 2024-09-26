public class VariableCompartida {
    private int v;

    public synchronized int getV() {
        return this.v;
    }

    public synchronized void setV(int v) {
        this.v = v;
    }

    public synchronized void inc(){
        this.v++;
    }
}
