public class ArrayDinamico {
    private int[] datos;
    private int tamano;
    private int capacidadMaxima;

    public ArrayDinamico(int capacidadInicial) {
        if (capacidadInicial <= 0) {
            System.out.println("La capacidad inicial debe ser mayor a 0");
        }
        this.capacidadMaxima = capacidadInicial;
        this.datos =  new int[capacidadMaxima];
        this.tamano = 0;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    public int getTamano() {
        return tamano;
    }

    public void mostrarArray(){
        if (tamano == 0){
            System.out.println("El array está vacío.");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < tamano; i++){
            System.out.print(datos[i]);
            if (i < (tamano-1)){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public void insertarValor(int valor){
        if (tamano == capacidadMaxima){
            redimensionar();
        }
        datos[tamano] = valor;
        tamano++;
    }

    public void redimensionar(){
        capacidadMaxima *= 2;
        int[] nuevosDatos = new int[capacidadMaxima];
        for (int i = 0; i < tamano; i++){
            nuevosDatos[i] = datos[i];
        }
        datos = nuevosDatos;
    }

    public void eliminarUltimoValor(){
        tamano--;
    }

    public int obtenerValorIndice(int indice){
        if (indice < 0 || indice >= tamano){
            throw new ArrayIndexOutOfBoundsException("El indice está fuera del rango.");
        }
        return datos[indice];
    }

    public static void main(String[] args) {
        ArrayDinamico array = new ArrayDinamico(2);
        array.insertarValor(2);
        array.insertarValor(1);
        array.insertarValor(3);
        array.mostrarArray();

        array.eliminarUltimoValor();
        array.mostrarArray();

        System.out.println("Obtener el valor del índice 0: "+ array.obtenerValorIndice(0));
        System.out.println("Obtener el valor del índice 1: "+ array.obtenerValorIndice(1));
        System.out.println("Obtener el valor del índice 5: "+ array.obtenerValorIndice(5));
    }
}