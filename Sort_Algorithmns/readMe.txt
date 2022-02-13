
Author: David, Saurav, Yisong, Nevyn

How to run

1, Download and extract our assignment folder
2, Open the command prompt and navigate to where our assignment was extracted to in the command prompt
3, Copy a version of the files you want to test into the res folder of our assignment
4, The command line parameters for our sorting program
	* -f or -F anything after this parameter you should put the name of the file you want to sort after it with the extension of the file. For example -fpolyfor1.txt
	* -t or -T Choosing your compare type. So after this you type in what parameter you want to sort by, which I will list below:
		* -h sort by height
		* -a sort by area
		* -v sort by volume
		An example for -t would be -ta for sorting by area
	* -s or -S is choosing the sorting method you would like to use to sort with. So after this you type in which sorting method you want to use, Parameters are:
		* -b use bubble sort method
		* -s use selection sort method
		* -i use insertion sort method
		* -m use merge sort method
		* -q use quick sort method
		* -z use heap sort method
		An example for -s would be -sb for sorting with bubble sort method

5,Putting the parameters together it could look something like this if you wanted to compare volumes using bubble sort method for the file name: polyfor1.txt
	* java -jar sort.jar -fpolyfor1.txt -Tv -Sb
6, Sort time is shown in nano seconds

References:

For Quick sort:
* I watched the following video provided in Module 2 C fastsorts slide 5: https://www.youtube.com/watch?v=SLauY6PpjW4&ab_channel=HackerRank
