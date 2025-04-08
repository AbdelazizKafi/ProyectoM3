import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*Lista frutas tipo ArrayList que almacena Strings. */
public class iterator {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Cereza");
        /*Se obtiene un iterador con el método Iterator() y utiliza bucle while con los métodos
         * hasNext() y next() para recorrer la colección. En cada una de estas iteraciones imprime el
         * nombre de la fruta
        */
        Iterator<String> it = frutas.iterator();
        System.out.println("Recorriendo la lista con Iterator:");
        while(it.hasNext()){
            String fruta = it.next();
            System.out.println(fruta);
        }
    }
}
