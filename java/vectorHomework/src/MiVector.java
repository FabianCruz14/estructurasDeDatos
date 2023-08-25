import java.util.Scanner;

public class MiVector {
    private int[] array;
    private int size;
    private int capacity;

    public MiVector(int initialCapacity) {
        capacity = initialCapacity;
        array = new int[capacity];
        size = 0;
    }

    public void insertarElemento(int elemento) {
        if (size < capacity) {
            array[size] = elemento;
            size++;
            System.out.println("Elemento insertado con éxito.");
        } else {
            System.out.println("El vector está lleno. No se puede insertar más elementos.");
        }
    }

    public void borrarElemento(int indice) {
        if (indice >= 0 && indice < size) {
            for (int i = indice; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            System.out.println("Elemento borrado con éxito.");
        } else {
            System.out.println("Índice inválido. No se puede borrar el elemento.");
        }
    }

    public void mostrarElementos() {
        System.out.println("Elementos en el vector:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int capacidadInicial = scanner.nextInt();

        MiVector vector = new MiVector(capacidadInicial);

        while (true) {
            System.out.println("\nOpciones:");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Borrar elemento");
            System.out.println("3. Mostrar elementos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a insertar: ");
                    int elementoInsertar = scanner.nextInt();
                    vector.insertarElemento(elementoInsertar);
                    break;
                case 2:
                    System.out.print("Ingrese el índice del elemento a borrar: ");
                    int indiceBorrar = scanner.nextInt();
                    vector.borrarElemento(indiceBorrar);
                    break;
                case 3:
                    vector.mostrarElementos();
                    break;
                case 4:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}

