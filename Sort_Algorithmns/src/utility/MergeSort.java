package utility;
import problemdomain.*;

import java.util.*;

/**
 * This is the merge sorting class which will divide input array in two halves, 
 * calls itself for the two halves and then merges the two sorted halves
 * @author 849961
 *
 */
public class MergeSort {
	
	private Comparator<Shape>compare;
	
	/**
	 * 
	 * @param myArray the array to be sorted
	 * @param compare compare shape comparator
	 * @return the sorted array
	 */
	public Shape[] mergesort(Shape[] myArray, Comparator<Shape>compare) {
		this.compare = compare;
		sort(myArray, 0, myArray.length-1);
		return myArray;
	}
	
	/**
	 * This method will sort the array
	 * @param myArray array
	 * @param l left part
	 * @param r right part
	 */
	private void sort(Shape[] myArray, int l, int r) {
		if (l < r) {
			// Find mid point
			int m = l + (r-l) / 2;
			sort(myArray, l, m);
			sort(myArray, m + 1, r);
			
			merge(myArray, l, m, r);
		}
	}
	
	/**
	 * This method will merge the two arrays into one
	 * @param myArray parent array
	 * @param l left part starting point
	 * @param m middle point
	 * @param r right part starting point
	 */
	private void merge(Shape[] myArray, int l, int m, int r) {
		int n1 = m - l + 1; 
		int n2 = r - m; 
		
		Shape[] L = new Shape[n1];
		Shape[] R = new Shape[n2];
		
		for (int i = 0; i < n1; i++) {
			L[i] = myArray[l+i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = myArray[m+j+1];
		}
		
		int i = 0; 
		int j = 0; 
		int k = l; 
		
		while(i < n1 && j < n2){
			if(compare.compare(L[i], R[j]) <= 0) {
				myArray[k] = L[i];
				i++;
			}
			else {
				myArray[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			myArray[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			myArray[k] = R[j];
			j++;
			k++;
		}
	}
}
