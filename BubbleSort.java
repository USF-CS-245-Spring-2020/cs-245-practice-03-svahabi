/**
 * *
 * BubbleSort: A Bubble Sort algorithm class that implements the Practice03Sort interface.
 * @author svahabi
 *
 */
public class BubbleSort implements Practice03Sort {
    /**
     * sort method which runs a bubble sort algorithm on array "a".
     * @param a
     */
    @Override
    public void sort(int[] a) {
        int passes = 1;
        boolean swapped = true;
        while(swapped){
            for(int i = 0; i < a.length; i++){
                if( a[i] > a[i] + 1){
                    swap(a, i, i+1);
                    swapped = true;

                }
            }
            ++passes;
        }
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
