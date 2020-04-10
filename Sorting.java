public class Sorting {
    public static void main(String[] args) {
        int[] arr = { 7, 2, 1, 4, 6, 5, };
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
        selectionSort(arr);
        for (int i : arr)
            System.out.print(i + " ");
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                // swap
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
           int temp = arr[min_index];
           arr[min_index] = arr[i];
           arr[i] = temp;
        }

    }

}
