import java.util.Vector;
/*Clase vector */
public class VectorEx {
    /*Método main y se crea un objeto Vector llamado letras que almacena Strings. */
    public static void main(String[] args) {
        Vector<String> letras = new Vector<>();
        /*Se añaden 3 elementos al vector letras */
        letras.add("A");
        letras.add("B");
        letras.add("C");
        
        /*Accede al elemento que se encuentra en la posición 1, en este caso será la letra B ya que
         * los indices comienzan en 0 y esa es la letra A. Se imprime.
         */
        System.out.println("Elemento en la posición 1: " + letras.get(1));

        /*Se recorre todo el vector con un bucle for y se imprimen todas las letras  */
        System.out.println("Contenido del Vector:");
        for (String letra : letras) {
            System.out.println(letra);
        }
    }
}
