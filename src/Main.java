import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 5, 7, 3, 1, 9, 0, 6, 10, 8};

        /**
         * In bubble sort, we go through every element one by one and swap each element based on the sorting order required.
         * In the first iteration, the largest is placed at the very end of the array. In the second iteration, second-largest element is placed in second last position, and so on.
         * The inner loop is only ran from 1 to (length - i) because the largest elements in the array would be placed in appropriate positions with each iteration (outer loop) and there is no point in checking those values again.
         * Time complexity - O(N^2) (worst case scenario)
         */
        bubbleSort(array);

        bubbleSortOptimized(array);
    }

    /**
     * Bubble sort algorithm.
     * This will sort given array in ascending order.
     * To sort any array in descending order, reverse the 'if' condition.
     * @param arr The given array
     */
    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    swapElements(j - 1, j, arr);
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Bubble sort algorithm.
     * This will sort given array in ascending order.
     * To sort any array in descending order, reverse the 'if' condition.
     *
     * To optimize the bubble sort algorithm, we can check if elements were swapped in inner iteration or not.
     * If the elements were not swapped, this means that the array is already sorted and there is no need to iterate anymore.
     * @param arr The given array
     */
    public static void bubbleSortOptimized(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int swapCount = 0;
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j - 1] > arr[j]){
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swapCount = 1;
                }
            }

            if(swapCount == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void swapElements(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
