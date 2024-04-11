import java.util.Deque;
import java.util.LinkedList;

public class Fila {
    public static void main(String[] args) {
        Deque<String> fila = new LinkedList<>();

        fila.add("1");
        fila.add("2");
        fila.add("3");
        fila.add("4");
        fila.add("5");

        System.out.println("Próximo elemento da fila: " + fila.peekFirst());

        String elementoRemovido = fila.pollFirst();
        System.out.println("Elemento removido da fila: " + elementoRemovido);

        System.out.println("Próximo elemento da fila após a remoção: " + fila.peekFirst());
    }
}
