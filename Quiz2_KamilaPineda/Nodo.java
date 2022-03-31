//Kamila Pineda Pacheco
public class Nodo {
    private int digito;
    private Nodo siguiente, anterior;

    public Nodo(int digito) {
        this.digito = digito;
    }

    public int getDigito() {
        return digito;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }
}
