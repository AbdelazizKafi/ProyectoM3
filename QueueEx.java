import java.util.Queue;
import java.util.LinkedList;

public class QueueEx {
    public static void main(String[] args) {
        /*Creamos una queue que almacena Strings. Se añaden 3 elementos a la cola con el método offer()
         * La clase LinkedList implementa la interfaz Queue
         */
        Queue<String> cola = new LinkedList<>();
        cola.offer("Primer elemento");
        cola.offer("Segundo elemento");
        cola.offer("Tercer elemento");
        /*Procesa la cola en un while que continua ejecutandose hasta que la cola esté vacia
         * Se va retirando e imprimiendo cada elemento de la cola con el método poll()
         */
        System.out.println("Procesando la cola (FIFO):");
        while(!cola.isEmpty()){
            System.out.println("Sacando: " + cola.poll());
        }
    }
}
