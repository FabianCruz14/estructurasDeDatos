import java.util.Vector;

public class VectorEjemplo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(); // Crear un Vector de elementos enteros

        // Insertar elementos en el Vector
        vector.add(5);
        vector.add(10);
        vector.add(15);

        // Mostrar todos los elementos en el Vector
        System.out.print("Elementos en el vector: ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();

        // Borrar un elemento en un índice específico
        int indiceABorrar = 1; // Índice del elemento a borrar (10)
        if (indiceABorrar >= 0 && indiceABorrar < vector.size()) {
            vector.remove(indiceABorrar);
        } else {
            System.out.println("Índice inválido. No se puede borrar el elemento.");
        }

        // Mostrar todos los elementos en el Vector después de borrar
        System.out.print("Elementos en el vector después de borrar: ");
        for (int i = 0; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }
        System.out.println();
    }
}
