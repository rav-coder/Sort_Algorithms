package utility;

import java.util.Comparator;

import problemdomain.Shape;

/**
 * Class Description: This a heap sort class. It receives an array and sorts elements on a descending order.
 * @author Saurav Adhikari (831561)
 * 
 */
public class MySort {
	
	private Comparator<Shape> compare = null;
	/**
	 * 
	 * @param myArray the array to be heap sorted
	 * @param compare the compare type
	 * @param size the size of the array received
	 * @return the sorted array
	 */
	public Shape[] heapSort(Shape [] myArray , int size, Comparator<Shape> compare) {

		this.compare = compare;
		
		for(int i = size / 2; i >= 0; i--) {
			heapify(myArray, size, i); //create the heap
		}
		
		for(int i=size - 1; i>= 0; i--) {
			swap(myArray, 0, i);
			
			heapify(myArray, i, 0); // destroy the heap to get descending order
		}
		
		return myArray;
		
	}
	
	/**
	 * 
	 * @param myArray the array to be heapified
	 * @param size the size of the heap
	 * @param i a node in the array
	 */
	private void heapify(Shape myArray [] , int size, int i) {
		
		//make min the index of current node, leftchild and rightchild subsequent childs
		int min = i;
		int leftChild = 2*i ;
		int rightChild = 2*i + 1;
		
		//if leftchild value is smaller than parent value make min index the leftchild index
		if(leftChild < size && compare.compare(myArray[leftChild], myArray[min]) > 0) {
			min = leftChild;
		}
		
		//if rightchild value is smaller than parent value make min index the rightchild index
		if(rightChild < size && compare.compare(myArray[rightChild], myArray[min]) > 0) {
			min = rightChild;
		}
		
		//if min is updated swap and recursively call heapify
		if(min!= i) {
			swap(myArray, min, i);
			
			heapify(myArray, size, min);
		}
	}
	
	/**
	 * 
	 * @param myArray the elements of this array will be swapped
	 * @param a index of element to be swapped
	 * @param b index of element to be swapped
	 */
	private void swap(Shape myArray [] , int a, int b) {
		Shape temp = myArray[a];
		myArray[a] = myArray[b];
		myArray[b] = temp;
	}
}
