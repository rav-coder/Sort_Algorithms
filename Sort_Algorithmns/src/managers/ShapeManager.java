package managers;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import application.AppDriver;
import problemdomain.*;

/**
 * Shape manager class for reading in a shape text file and assigning the shapes to their correct
 * subclass
 * @author Group Auron
 *
 */
public class ShapeManager
{
	// Getting the file path from the app driver
	AppDriver ap = new AppDriver();
	private final String FILE_PATH = ap.getFILE_PATH();
	Shape[] shapeList;
	
	/**
	 * Method for reading in the file and assigning each shape to its appropriate class
	 * @throws IOException 
	 */
	public void loadFile () throws IOException
	{
		Scanner in = new Scanner(new File(FILE_PATH));
		//Reading in the amount of shapes from file which determines the array size
		int arraySize = in.nextInt();
		shapeList = new Shape[arraySize];
		
		for(int i = 0; i<arraySize; i++) {
			//Reading in one shape at a time with its measurements
			String shapeName = in.next();
			double height = in.nextDouble();
			double sideValue = in.nextDouble();
			
			//Switch statement for sorting out the shapes into its appropriate class
			switch(shapeName) {
				case "Cylinder":
					shapeList[i] = new Cylinder(height, sideValue);
					break;
				case "Cone":
					shapeList[i] = new Cone(height, sideValue);
					break;
				case "SquarePrism":
					shapeList[i] = new SquarePrism(height, sideValue);
					break;
				case "TriangularPrism":
					shapeList[i] = new EquilateralTrianglePrism(height, sideValue);
					break;
				case "PentagonalPrism":
					shapeList[i] = new PentagonPrism(height, sideValue);
					break;
				case "OctagonalPrism":
					shapeList[i] = new OctagonPrism(height, sideValue);
					break;
				case "Pyramid":
					shapeList[i] = new Pyramids(height, sideValue);
					break;
			}
		}
		
		in.close();
	}

	public Shape[] getList()
	{
		return shapeList;
	}
	
	
	
}