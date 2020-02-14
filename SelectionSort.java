/**
 * *
 * SelectionSort: A Selection Algorithm class that implements the Practice03Search interface.
 * @author svahabi
 *
 */
public class SelectionSort implements Practice03Sort{
    /**
     * sort method which runs a selection sort algorithm on array "a".
     * @param a
     */
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            swap(a, i, findmin(a, i));
        }
    }

    /**
     * findmin method which runs through array "a" and returns the smallest value
     * @param a
     * @param start
     * @return min
     */
    public int findmin(int[] a, int start){
        int min = start;
        for(int i = 0; i < a.length; i++){
            if(a[i]<a[min]){
                min = i;

            }
        }
        return min;
    }

    /**
     * swap method which swaps i and j in array "arr".
     * @param a
     * @param i
     * @param j
     */
    void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}