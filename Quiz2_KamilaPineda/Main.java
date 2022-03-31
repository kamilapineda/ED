//Kamiila Pineda Pacheco
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ListaCircularD n1 = new ListaCircularD();
        ListaCircularD n2 = new ListaCircularD();

        String fichero = "entrada.txt";
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            String linea = br.readLine();
            for (char digito:linea.toCharArray()) {
                Nodo nuevo = new Nodo(Integer.parseInt(digito + ""));
                n1.add(nuevo);
            }
            linea = br.readLine();
            for (char digito:linea.toCharArray()) {
                n2.add(new Nodo(Integer.parseInt(digito + "")));
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        ArrayList<ListaCircularD> sumaN = new ArrayList<>();
        sumaN.add(n1);
        sumaN.add(n2);
        sumaN.add(suma(n1, n2));
        sumaN.get(0).mostrar();
        System.out.println("+++");
        sumaN.get(1).mostrar();
        System.out.println("RESULTADO:");
        sumaN.get(2).invertir();
        sumaN.get(2).mostrar();
    }

    private static ListaCircularD suma(ListaCircularD n1, ListaCircularD n2){
        ListaCircularD resultado = new ListaCircularD();
        Nodo actual1 = n1.firstNodo.getAnterior();
        Nodo actual2 = n2.firstNodo.getAnterior();
        int suma = 0;
        do {
            suma += actual1.getDigito() + actual2.getDigito();
            resultado.add(new Nodo(suma%10));
            if (suma > 9){
                suma = 1;
            }else {
                suma = 0;
            }
            actual1 = actual1.getAnterior();
            actual2 = actual2.getAnterior();
        }while (actual1 != n1.firstNodo.getAnterior());
        if (suma == 1){
            resultado.add(new Nodo(1));
        }
        return resultado;
    }
}
