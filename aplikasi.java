public class aplikasi {
    // Method untuk Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n-1; i++) {
            // Mencari elemen minimum dalam array yang belum terurut
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Menukar elemen minimum dengan elemen pertama yang belum terurut
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            
            // Menampilkan proses pengurutan
            System.out.print("Langkah " + (i+1) + ": ");
            printArray(arr);
        }
    }

    // Method untuk Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Mencari posisi pivot
            int pi = partition(arr, low, high);
            
            // Menampilkan proses pengurutan
            System.out.print("Setelah partisi: ");
            printArray(arr);
            
            // Rekursif untuk bagian kiri dan kanan pivot
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    
    // Method untuk mencari partisi Quick Sort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                
                // Menukar elemen
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        // Menempatkan pivot pada posisi yang tepat
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        
        return i + 1;
    }

    // Method untuk mencetak array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array untuk Selection Sort
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\n=== Selection Sort ===");
        System.out.println("Array Original:");
        printArray(arr1);
        System.out.println("\nProses Selection Sort:");
        selectionSort(arr1);
        System.out.println("\nArray setelah Selection Sort:");
        printArray(arr1);

        // Array untuk Quick Sort
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\n=== Quick Sort ===");
        System.out.println("Array Original:");
        printArray(arr2);
        System.out.println("\nProses Quick Sort:");
        quickSort(arr2, 0, arr2.length-1);
        System.out.println("\nArray setelah Quick Sort:");
        printArray(arr2);
    }
}