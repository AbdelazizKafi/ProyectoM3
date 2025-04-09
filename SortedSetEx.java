/*Se importan las clases SortedSet y TreeSet */
import java.util.SortedSet;
import java.util.TreeSet;
/*Clase SortedSetEx */
public class SortedSetEx {
    /*Método main con un objeto SortedSet llamado numeros que almacena Integers usando TreeSet para 
     * mantener un orden. No se permiten elementos duplicados.
     */
    public static void main(String[] args) {
        SortedSet<Integer> numeros = new TreeSet<>();
        /*Se añaden 6 números enteros al set. */
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);
        numeros.add(3);
        numeros.add(7);
        /*Se imprime el conjunto entero, el cual aparecerá ordenado al estar usando Set. */
        System.out.println("SortedSet completo: " + numeros);

        /*Creamos un subConjunto que contiene los números del 5 al 15. Se incluye el 5 y se excluye el 15 */
        SortedSet<Integer> subConjunto = numeros.subSet(5, 15);
        System.out.println("\nsubSet(5, 15): " + subConjunto);

        /*Se crea un conjunto llamado conjuntoCabeza  con todos los elementos menores que 10.
         * Al usar toElement, el número 10 en si se excluye.
         */
        SortedSet<Integer> conjuntoCabeza = numeros.headSet(10);
        System.out.println("\nheadSet(10): " + conjuntoCabeza);

        /*Se crea un conjunto llamado conjuntoCola con los numeros mayores a 10 y en este caso
         * si que se incluye el propio 10 ya que usamos fromElement.
         */
        SortedSet<Integer> conjuntoCola = numeros.tailSet(10);
        System.out.println("\ntailSet(10): " + conjuntoCola);

        /*Con el método first se muestra el primero elemento del primer conjunto, que es el numero más pequeño
         * Con el método last se muestra el último elemento del primer conjunto, que es el número más grande
         */
        System.out.println("\nPrimer elemento (first()): " + numeros.first());
        System.out.println("Último elemento (last()): " + numeros.last());
    }
}
