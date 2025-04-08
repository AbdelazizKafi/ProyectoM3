class comparableEx implements Comparable<comparableEx> {
    private String nombre;
    private int edad;
    
    public comparableEx(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    /*Método compareTo para comparar objetos según su edad */
    @Override
    public int compareTo(comparableEx otra) {
        return Integer.compare(this.edad, otra.edad);
    }
    /*Método toString para mostrar el nombre y la edad */
    @Override
    public String toString(){
        return nombre + " (" + edad + ")";
    }
    /*Método main con 3 instancias, se colocan en un array y se ordena este usando Arrays.sort */
    public static void main(String[] args) {
        comparableEx p1 = new comparableEx("Ana", 30);
        comparableEx p2 = new comparableEx("Luis", 25);
        comparableEx p3 = new comparableEx("Carlos", 35);
        
        comparableEx[] personas = {p1, p2, p3};
        java.util.Arrays.sort(personas);
        
        System.out.println("Personas ordenadas por edad:");
        for (comparableEx p : personas) {
            System.out.println(p);
        }
    }
}
