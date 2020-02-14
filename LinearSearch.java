/**
 * *
 * LinearSearch: A Linear Search Algorithm class that implements the Practice03Search interface.
 * @author svahabi
 *
 */
public class LinearSearch implements Practice03Search {
    /**
     * search method which runs a linear search algorithm and searches for the target value in array "arr".
     * @param arr
     * @param target
     * @return 0
     *
     */
    @Override
    public int search(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return i;
            }
            else{
                return -1;
            }
        }

        return 0;
    }
}
