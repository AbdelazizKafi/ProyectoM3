import java.util.Arrays;

public class ArraysEx {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 1, 2};
        
        /*Método para ordenar el array numeros */
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }
}   