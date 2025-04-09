/*Se importan las clases HashSet y Set */
import java.util.HashSet;
import java.util.Set;
/*Crea una clase llamada SetExample */
public class SetExample {
    /*Método main con un método Set llamado numeros el cual almacena elementos de tipo Integer */
    public static void main(String[] args) {
        /*Añadimos 4 valores diferentes con el método add() */
        Set<Integer> numeros = new HashSet<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        /*Recorre el conjunto con un for y se imprime por pantalla.
         * En este ejemplo mostramos la propiedad principal de un Set: no se permiten elementos duplicados.
         * Al ejecutar este código, solamente se imprimirán 3 valores ya que el numero 20 está repetido.
         * Se imprime sin ningún orden ya que no hemos utilizado ningún orden específico.
         */
        System.out.println("Elementos del HashSet:");
        for (Integer num : numeros) {
            System.out.println(num);
        }
    }
}
