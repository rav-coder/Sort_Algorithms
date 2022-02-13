package utility;

import java.util.Comparator;

import problemdomain.Shape;

/**
 * 
 * Class Description: Comparator class for shape area
 *
 */
public class AreaCompare implements Comparator<Shape>
{

	@Override
	public int compare(Shape o1, Shape o2)
	{
		if(o1.calcArea() < o2.calcArea()) {
			return 1;
		}
		else if(o1.calcArea() > o2.calcArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
