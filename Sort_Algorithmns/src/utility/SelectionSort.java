package utility;
import java.util.Comparator;
import problemdomain.Shape;

/**
 * Description: This a Selection sort method that sorts an array in descending order.
 * The most stable sorting algorithm appears.
 * It will find the smallest element in the unsorted order and find the smallest element from the unsorted, 
 * and then continue to restart the sorting order, and then continue.
 * @author Yisong Wang (000802302)
 * @return 
 *
 */
public class SelectionSort {
	
	 /**
	  * 	
	  * @param arr array of shapes to be sorted
	  * @param compare compare type
	  * @return sorted array
	  */
	public Shape [] SelectionSorter (Shape[] arr, Comparator<Shape> compare) {
		for (int i = 0; i < arr.length - 1; i++) {
			//Define the largest element
			int max = i;
			// Find out the largest element after max
			for (int j = i + 1; j < arr.length; j ++) {
				if (compare.compare(arr[j], arr[max]) < 0) {
					max = j;
				}
			}
			//Swap the array
			Shape temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
		}
		return arr;
	}
}
