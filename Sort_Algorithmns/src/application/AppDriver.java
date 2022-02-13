package application;

import java.io.IOException;
import java.util.Comparator;

import managers.ShapeManager;
import problemdomain.Shape;
import utility.*;

/**
 * 
 * Class Description: This class gets arguments from the user from the command line and runs different sort types
 * based on the user input. It prints the sorted data in descending order.
 * @author Team Auron
 *
 */
public class AppDriver
{
	private static String FILE_PATH = ""; //store the relative path of the file to be sorted
	
	private static Shape[] sortedShape = null; //the array with the sorted shapes
	
	public static void main(String[] args) throws IOException
	{
		long start = 0; //start time for sort
		long stop = 0; // end time for sort
		String sortBy = "";
		String sortType = "";
		String sortByName = "";
		Comparator<Shape> compare = null;
		
		//get file path, sort type and the attribute to sort the shapes by
		for (String s: args) {
            
            if(s.contains("-f") || s.contains("-F")) {
            	FILE_PATH = "res/" + s.substring(2, s.length());
            }
            
            if(s.contains("-t") || s.contains("-T")) {
            	sortBy = s.substring(2, s.length());
            }
            
            if(s.contains("-s") || s.contains("-S")) {
            	sortType = s.substring(2, s.length());
            }
            
        }
		
		ShapeManager sm = new ShapeManager();
		sm.loadFile();
		
		Shape[] shape = sm.getList();

		//sort on height, area or volume based on cli inputs		
		switch(sortBy) {
		 case "h": 
			 compare = (s1, s2)-> s1.compareTo(s2);
			 sortByName = "Height";
			 break;
		 case "a": 
			 compare = new AreaCompare();
			 sortByName = "Area";
			 break;
		 case "v":
			 compare = new VolumeCompare();
			 sortByName = "Volume";
		 	 break;
		 default: System.out.println("Invalid");
		}
		
		//bubble sort, selection sort, insertion sort, merge sort, heap sort and quick sort based on cli inputs
		switch(sortType) {
		 case "b": 
			 BubbleSort bs = new BubbleSort();
			 start = System.nanoTime();
			 sortedShape = bs.bubblesort(shape, compare);
			 stop = System.nanoTime();			 
			 break;
		 case "s": 
			 SelectionSort ss = new SelectionSort();
             start = System.nanoTime();
             sortedShape = ss.SelectionSorter(shape, compare);
             stop = System.nanoTime();
             break;
		 case "i":
			 InsertionSort is = new InsertionSort();
             start = System.nanoTime();
             sortedShape = is.InsertionSorter(shape, compare);
             stop = System.nanoTime();
              break;
		 case "m":
			 MergeSort ms = new MergeSort();
			 start = System.nanoTime();
			 sortedShape = ms.mergesort(shape, compare);
			 stop = System.nanoTime();
		 	 break;
		 case "q":
			 QuickSort qs = new QuickSort();
			 start = System.nanoTime();
			 sortedShape = qs.quicksort(shape, compare);
			 stop = System.nanoTime();
		 	 break;
		 case "z":
			 MySort ms2 = new MySort();
			 start = System.nanoTime();
			 sortedShape = ms2.heapSort(shape, shape.length, compare);
			 stop = System.nanoTime();
		 	 break;
		 default: System.out.println("Invalid");
		 
		}
		
		//print the first, last and every 1000th element of the sorted array to the console
		System.out.println(String.format("Time elapsed: %d \n", stop-start));
		 System.out.println(String.format("Shapes sorted descending on %s \n", sortByName));
		 System.out.println(String.format("%-30s %20s %20s %20s %30s \n", 
					"Shape", "Height", "Side/Radius", "Area", "Volume"));
			
			for(int i=0; i< shape.length; i+=1000) {
				System.out.println(sortedShape[i] + " ");
			}
			
			System.out.println(sortedShape[sortedShape.length-1] + " ");

		
	}

	public String getFILE_PATH() {
		return FILE_PATH;
	}
	
}
