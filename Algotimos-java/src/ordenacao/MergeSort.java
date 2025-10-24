package ordenacao;

/**
 * MergeSort - algoritmo de ordenação baseado em divisão e conquista.
 * Complexidade: O(n log n)
 */

public class MergeSort {

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = array[left + i];
        for (int j = 0; j < n2; j++) R[j] = array[middle + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) array[k++] = L[i++];
            else array[k++] = R[j++];
        }

        while (i < n1) array[k++] = L[i++];
        while (j < n2) array[k++] = R[j++];
    }

    public static void main(String[] args) {
        int[] vetor = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(vetor, 0, vetor.length - 1);
        System.out.println("Array ordenado:");
        for (int num : vetor) System.out.print(num + " ");
    }
}
