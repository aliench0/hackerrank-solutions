public class Main {
    public static void main(String[] args) {
        int[] array = {7, 1, 3, 2, 4, 5, 6};
        System.out.println(minimumSwaps(array));
    }

    static int minimumSwaps(int[] arr) {
        int minSwaps = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            int indexOfMin = findIndexOfMin(arr, i);
            if (indexOfMin == i) {
                continue;
            }
            swap(arr, i, indexOfMin);
            minSwaps++;
        }
        return minSwaps;
    }

    static int findIndexOfMin(int[] arr, int afterIndex) {
        int min = arr[afterIndex];
        int indexOfMin = afterIndex;
        for (int i = afterIndex + 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
