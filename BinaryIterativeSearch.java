/**
 * *
 * BinaryIterativeSearch: An Iterative Binary Search Algorithm class that implements the Practice03Search interface.
 * @author svahabi
 *
 */
public class BinaryIterativeSearch implements Practice03Search {
    /**
     * search method designed to run a Binary search iteratively through array "arr".
     * @param arr
     * @param target
     * @return -1
     */
    @Override
    public int search(int[] arr, int target) {
        int max = arr.length-1;
        int min = 0;
        while(min<=max){
            int mid = (min+max)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid] < target){
                min= mid+1;
            }
            else{
                max = mid-1;
            }
        }
        return -1;
    }
}

