package utility;
import problemdomain.*;
import java.util.*;

/**
 * Description: This a quick sort method that sorts an array in descending order.
 * 
 * @author David Wei (000861349)
 *
 */
public class QuickSort {
	
	private Comparator<Shape> compare;
	
	/**
	 * Initial method call for quick sort
	 * @param toSort an array of shapes to be sorted
	 * @param compare shape comparator
	 * @return the sorted array
	 */
	public Shape [] quicksort (Shape[] toSort, Comparator<Shape> compare) {
		this.compare = compare;
		quicksort(toSort, 0, toSort.length -1);
		
		return toSort;
	}
	
	/**
	 * recursive method that does the sorting
	 * @param toSort an array of shapes to be sorted
	 * @param left left side pointer
	 * @param right right side pointer
	 */
	private void quicksort(Shape[] toSort, int left, int right) {
		if (left >= right) {
			return;
		}
		
		//median of 3 pivot
		Shape pivot = toSort[(left + right) / 2];
		
		//partition the array around the pivot above
		int index = partition(toSort, left, right, pivot);
		quicksort(toSort, left, index - 1);
		quicksort(toSort, index, right);
	}
	
	/**
	 * partition method that partitions the array
	 * @param toSort an array of shapes to be sorted
	 * @param left left side pointer
	 * @param right right side pointer
	 * @param pivot the chosen pivot for the sort
	 * @return parition's position
	 */
	private int partition(Shape[] toSort, int left, int right, Shape pivot) {
		while (left <= right) {
			//left pointer will move to an element that is smaller than the pivot
			while (compare.compare(toSort[left], pivot) < 0) {
				left ++;
			}
			
			//right pointer will move to an element that is bigger than the pivot
			while (compare.compare(toSort[right], pivot) > 0) {
				right--;
			}
			
			if(left <= right ) {
				//swap elements
				Shape swap = toSort[left];
				toSort[left] = toSort[right];
				toSort[right] = swap;
				left ++;
				right--;
			}
		}
		return left;
	}
}
