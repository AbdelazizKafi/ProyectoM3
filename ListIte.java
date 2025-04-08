import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*Lista que permite hacer el recorrido en ambas direcciones */
public class ListIte {
    public static void main(String[] args) {
        List<String> colores = new ArrayList<>();
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        /* Con ListIterator se recorren bidireccionalmente.
        Se recorre la lista hacia adelante con hasNext y next*/
        ListIterator<String> li = colores.listIterator();
        System.out.println("Recorrido hacia adelante:");
        while(li.hasNext()){
            System.out.println(li.next());
        }
        
        /*Se recorre la lista hacia atrás con hasPrevious y previous*/
        System.out.println("Recorrido hacia atrás:");
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
    }
}
