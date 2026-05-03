package basicPrograms;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		
		//Array with data
		int[] a = new int[] {5,6,7,4,2,3,1,9,0,8};
		selectionSort(Arrays.copyOf(a, a.length));
        //quickSort(a);
	}

    //Selection Sort
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public static void selectionSort(int[] a) {
        int arrLength = a.length;
        for(int i=0; i<arrLength; ++i) {
            for(int j=i+1; j<arrLength;++j) {
                int temp;
                if(a[j]<a[i]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

}
