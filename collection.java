import java.util.Collection;
import java.util.ArrayList;

/*Variable nombres de tipo Collection<String>. Se crea una colleción tipo ArrayList que almacena Strings */
public class collection {
    public static void main(String[] args) {
        Collection<String> nombres = new ArrayList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.add("Carlos");
        /*Se recorre la colección con un bucle  */
        System.out.println("Elementos de la colección:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
