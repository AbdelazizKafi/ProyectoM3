/*Se importan las clases SortedMap y TreeMap */
import java.util.SortedMap;
import java.util.TreeMap;
/*Clase llamada SortedMapEx */
public class SortedMapEx {
    /*Método main con un objeto SortedMap de nombre puntuaciones. Instancia TreeMap para mantener
     * los elementos ordenados automáticamente por claves (este caso alfabéticamente)
     */
    public static void main(String[] args) {
        SortedMap<String, Integer> puntuaciones = new TreeMap<>();
        /*Añadimos 5 valores diferentes con nombres y puntuaciones */
        puntuaciones.put("Ana", 85);
        puntuaciones.put("Carlos", 92);
        puntuaciones.put("Beatriz", 78);
        puntuaciones.put("Daniel", 90);
        puntuaciones.put("Elena", 95);
        
        /*Se imprime el contenido completo para ver el orden de los elementos. Como se usa TreeMap,
         * aparecen en orden alfabético
         */
        System.out.println("SortedMap completo:");
        System.out.println(puntuaciones);

        /*Se crea un subMap llamado subMapa que contiene todas las entradas con claves que están
         * entre Beatriz y Elena. Como el contenido está ordenador alfabéticamente, se cogen Beatriz,
         * Carlos y Daniel. Beatriz no se muestra ya que en el método subMap se especifica que fromKey
         * se incluye pero toKey no.
         */
        SortedMap<String, Integer> subMapa = puntuaciones.subMap("Beatriz", "Elena");
        System.out.println(subMapa);

        /*Ahora se crea un headMap llamado headMapa. Con headMap solo se muestran la parte del mapa 
         * donde las claves son menores al toKey (en este caso Daniel). Esto se hace comparando las
         * claves alfabéticamente. Por ejemplo, Elena es mayor que Beatriz y Carlos es menor que Daniel.
         * Daniel no se muestra ya que hemos usado toKey el cual excluye la propia clave.
         */
        SortedMap<String, Integer> headMapa = puntuaciones.headMap("Daniel");
        System.out.println(headMapa);

        /*Creamos un tailMap con nombre tailMapa. Lo que hace este mapa es lo mismo que headMap pero al revés.
         * Ahora en vez de mostrarse las claves menores, se muestran las claves mayores o iguales a Carlos.
         * Como es fromKey, también se incluye el propio valor
         */
        SortedMap<String, Integer> tailMapa = puntuaciones.tailMap("Carlos");
        System.out.println(tailMapa);

    }
}
