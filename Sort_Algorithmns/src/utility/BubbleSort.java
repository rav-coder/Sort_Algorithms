package utility;
import java.util.*;
import problemdomain.*;

/**
 * This is the bubble sorting class which will sort the list from left to right
 * @author 849961
 *
 */
public class BubbleSort {
  
		/**
	 * This is the method that will be doing the sorting
	 * @param myArray the array to be sorted
	 * @param compare shape comparator
	 * @return the sorted array
	 */
	public Shape[] bubblesort(Shape[] myArray, Comparator<Shape> compare) {
		int start = 0;
		int end = myArray.length;
		boolean swapped = true;

		while (swapped) {
			swapped = false;
			for (int i = start; i < end - 1; i ++) {
				if (compare.compare(myArray[i], myArray[i+1]) > 0) {
					swap(myArray, i, i+1);
					swapped = true;
				}
			}
			if (!swapped) break;
			swapped = false;
			end --;
			for (int i = end - 1; i >= start; i --) {
				if (compare.compare(myArray[i], myArray[i+1]) > 0) {
					swap(myArray, i, i+1);
					swapped = true;
				}
			}
			start ++;
		}
		
		return myArray;
	}
	
	/**
	 * This is the method that will be swaping the elements in the array
	 * @param myArray the array
	 * @param i position of the first element
	 * @param j position of the second element
	 */
	private void swap(Shape[] myArray, int i, int j) {
		Shape temp = myArray[i];
		myArray[i] = myArray[j];
		myArray[j] = temp;
	}
}
