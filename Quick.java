public class Quick {
    public static void main(String[] args) {
        int[] arr = { 456, 3, 64, 23, 67, 9, 34 };
        printArray(arr);
        quicksort(arr, 0, arr.length - 1);
        printArray(arr);

    }

    static void quicksort(int arr[], int l, int u) {
        if (l < u) {
            int p = partition(arr, l, u);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, u);
        }
    }

    private static int partition(int[] arr, int l, int u) {
        int pivot = l;
        int lp = l + 1;
        int rp = u;

        while (lp < rp) {
            while (arr[lp] < pivot)
                lp++;

            while (arr[rp] > pivot)
                rp--;

            int temp = arr[lp];
            arr[lp] = arr[rp];
            arr[rp] = temp;
        }

        int temp = arr[pivot];
        arr[pivot] = arr[lp];
        arr[lp] = temp;

        return lp;
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}