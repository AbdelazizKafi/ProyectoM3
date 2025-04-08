import java.util.List;
import java.util.ArrayList;
/*Igual que en ejemplos anteriores, se crea una lista ArrayList que almacena Strings.
 * Se añaden 3 ciudades y una de ellas repetida ya que las listas lo permiten
 */
public class ListEx {
    public static void main(String[] args) {
        List<String> ciudades = new ArrayList<>();
        ciudades.add("Madrid");
        ciudades.add("Barcelona");
        ciudades.add("Madrid"); 
        /*Bucle for para recorrer la lista e imprimir cada elemento */
        System.out.println("Ciudades en la lista:");
        for (String ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
}
