package utility;
import java.util.Comparator;

import problemdomain.Shape;
/**
 * Description: This a Insertion sort method that sorts an array in descending order.
 * By constructing an ordered sequence, the unsorted data is scanned from back to 
 * front in the ordered sequence to find the corresponding position to insert.
 * In this process,the sorted elements need to be moved backward
 * to provide space for new elements.
 * @author Yisong Wang (000802302)
 * @return 
 *
 */

public class InsertionSort {

 /**
  * 	
  * @param arr array of shapes to be sorted
  * @param compare compare type
  * @return sorted array
  */
 public Shape[] InsertionSorter (Shape[] arr, Comparator<Shape> compare){
	if(arr.length == 0){
		return arr;
	}
	//Define current array
	Shape currentarr;
	//add a new element after current array
	for(int i=0;i<arr.length-1;i++){
		currentarr = arr[i+1];
		int j = i;
		//compare the elements and put them in correct place
		while(j >= 0 && compare.compare (arr[j], currentarr) > 0){
			arr[j + 1] = arr[j];
			j--;
		}
		//return the array
		arr[j + 1] = currentarr;
	}
	return arr;
 }
}