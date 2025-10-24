package busca;

/**
 * Binary Search - busca binária em vetor ordenado.
 * Complexidade: O(log n)
 */

public class BinarySearch {

    public static int binarySearch(int[] array, int target) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) return mid;
            if (array[mid] < target) left = mid + 1;
            else right = mid - 1;
        }

        return -1; // Não encontrado
    }

    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11};
        int busca = 7;
        int resultado = binarySearch(vetor, busca);

        if (resultado != -1)
            System.out.println("Elemento encontrado no índice: " + resultado);
        else
            System.out.println("Elemento não encontrado.");
    }
}
