import java.util.Arrays;
import java.util.Comparator;

public class PersonaComparatorExample {
    /*Se define una clase interna estatica con dos variables */
    static class Persona {
        String nombre;
        int edad;
        /*Constructor */
        public Persona(String nombre, int edad){
            this.nombre = nombre;
            this.edad = edad;
        }
        /*Método toString que devuelve el nombre y la edad de manera que se pueda 
        mostrar por pantalla y leer */
        @Override
        public String toString(){
            return nombre + " (" + edad + ")";
        }
    }
    /*Método main que crea 3 objetos persona */
    public static void main(String[] args) {
        Persona p1 = new Persona("Ana", 30);
        Persona p2 = new Persona("Luis", 25);
        Persona p3 = new Persona("Carlos", 35);
        /*Se almacenan las 3 personas en un array */
        Persona[] personas = {p1, p2, p3};
        
        /*Se utiliza el metodo Comparator de los objetos Persona. Implementa el método compare() para
         * comparar personas según sus nombres. Con compareTo se realiza una comparación alfabética ya
         * que son valores String.
         */
        Comparator<Persona> cmpNombre = new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.nombre.compareTo(o2.nombre);
            }
        };
        /*Se ordena el array personas utilizando el comparador definido anteriormente */
        Arrays.sort(personas, cmpNombre);
        /*Recorre el array y imprime los nombres y edades de las personas ordenados alfabéticamente*/
        System.out.println("Personas ordenadas por nombre:");
        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
