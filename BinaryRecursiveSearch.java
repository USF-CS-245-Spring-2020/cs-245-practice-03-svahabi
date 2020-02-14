/**
 * *
 * BinaryRecursiveSearch: A Recursive Binary Search Algorithm class that implements the Practice03Search interface.
 * @author svahabi
 *
 */
public class BinaryRecursiveSearch implements Practice03Search {
    /**
     * search method which sets up basic variables for the recursive binsearch method
     * @param arr
     * @param target
     * @return 0
     */
    @Override
    public int search(int[] arr, int target) {
        int max = arr.length-1;
        int min = 0;
        return 0;
    }

    /**
     * binsearch method which runs a recursive Binary Search on the array "arr".
     * @param arr
     * @param target
     * @param min
     * @param max
     */
    public int binsearch(int[] arr, int target, int min, int max) {
        int mid = (min + max / 2);
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binsearch(arr, target, mid + 1, max);
        } else {
            return binsearch(arr, target, min, mid - 1);
        }

    }
}
