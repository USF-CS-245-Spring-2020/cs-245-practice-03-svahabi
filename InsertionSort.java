/**
 * *
 * InsertionSort: An Insertion Sort Algorithm class that implements the Practice03Sort interface.
 * @author svahabi
 *
 */
public class InsertionSort implements Practice03Sort{
    /**
     * Insertion sort method which sorts the values in array "a".
     * @param a
     */
    @Override
    public void sort(int[] a) {
        for (int i = 0; i < a.length; i++){
            int temp = a[i];
            int j = i-1;
            while(temp < a[j] && j>=0){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = temp;
        }
    }

    }

