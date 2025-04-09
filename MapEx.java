import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class MapEx {
    public static void main(String[] args) {
        /*Se crea un objeto Map que utiliza Hashmap donde las claves son las palabras en inglés
         * y los valores son las palabras en español*/
        Map<String, String> diccionario = new HashMap<>();

        diccionario.put("hello", "hola");
        diccionario.put("goodbye", "adiós");
        diccionario.put("morning", "mañana");
        /*Se obtienen las traducciones de las claves con get() y se muestran por pantalla */
        String traduccionHello = diccionario.get("hello");
        System.out.println("La traducción de 'hello' es: " + traduccionHello);
        /*Con containsKey se verifica si la palabra está en el diccionario. Responde con true o false */
        boolean tieneMorning = diccionario.containsKey("morning");
        System.out.println("¿Existe la clave 'morning'? " + tieneMorning);
        /*Con remove elimina la clave morning y se vuelve a mostrar el contenido actualizado */
        diccionario.remove("morning");
        System.out.println("Mapa tras eliminar la clave 'morning': " + diccionario);

        /*Se obtienen todos los valores del diccionario con values () y se imprime por pantalla */
        Collection<String> valores = diccionario.values();
        System.out.println("Valores en el diccionario: " + valores);
        /*Con un bucle for se recorren todas las entradas y con entrySet() se muestran todas las parejas
         * clave-valor.
          */
        for (Map.Entry<String, String> entrada : diccionario.entrySet()) {
            String clave = entrada.getKey();
            String valor = entrada.getValue();
            System.out.println("Clave = " + clave + ", Valor = " + valor);
        }
        /*Con size() se muestra el tamaño del diccionario el cual es 2 después de eliminar la clave morning */
        System.out.println("Tamaño del diccionario: " + diccionario.size());
    }
}
