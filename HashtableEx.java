import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableEx {
    /*Objeto Hashtable llamado productos que guarda una clave(producto) y un valor(precio)*/
    public static void main(String[] args) {
        Hashtable<String, Integer> productos = new Hashtable<>();
        productos.put("Libro", 15);
        productos.put("Pluma", 3);
        productos.put("Cuaderno", 8);
        
        /*Se enumeran todas las claves del Hashtable usando keys y con hasMoreElements y nextElement
          se recorren todas las claves. Por cada clave recorrida, imprime la propia clave y su valor*/
        System.out.println("Recorriendo...");
        Enumeration<String> claves = productos.keys();
        while(claves.hasMoreElements()){
            String clave = claves.nextElement();
            System.out.println(clave + " -> " + productos.get(clave));
        }
    }
}
