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
        System.out.println("[");
        for (int i = 0; i < tamano; i++){
            System.out.println(datos[i]);
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        ArrayDinamico array = new ArrayDinamico(10);
        array.mostrarArray();
    }
}