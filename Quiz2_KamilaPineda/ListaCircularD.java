//Kamila Pineda Pacheco
public class ListaCircularD {
    Nodo firstNodo;
    int size;

    public void add(Nodo nuevoNodo){
        if (firstNodo != null){
            if (firstNodo.getAnterior()!=null){
                nuevoNodo.setAnterior(firstNodo.getAnterior());
                firstNodo.getAnterior().setSiguiente(nuevoNodo);
            } else{
                firstNodo.setSiguiente(nuevoNodo);
                nuevoNodo.setAnterior(firstNodo);
            }
            nuevoNodo.setSiguiente(firstNodo);
            firstNodo.setAnterior(nuevoNodo);
        } else{
            firstNodo=nuevoNodo;
        }
        size++;
    }
    public void vistaSuma(){
        Nodo act = firstNodo.getAnterior();
        do {
            System.out.print(act.getDigito());
            act = act.getAnterior();
        }while (act != firstNodo.getAnterior());
    }
    public void mostrar(){
        Nodo act = firstNodo;
        do{
            System.out.println(act.getDigito());
            act=act.getSiguiente();
        }while (act != firstNodo);
    }
    public void invertir() {
        firstNodo = firstNodo.getAnterior();
        Nodo siguiente = firstNodo.getAnterior(), act = firstNodo, ultimo = firstNodo.getSiguiente();
        for (int i = 0; i < size; i++) {
            if (siguiente != ultimo) {
                siguiente.setSiguiente(act.getSiguiente());
                act.getSiguiente().setAnterior(siguiente);
                firstNodo.setAnterior(siguiente.getAnterior());
                siguiente.setAnterior(act);
                act.setSiguiente(siguiente);
                firstNodo.getAnterior().setSiguiente(firstNodo);
                act = siguiente;
                siguiente = firstNodo.getAnterior();
            }
        }
    }
}
