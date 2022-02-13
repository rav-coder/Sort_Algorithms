package problemdomain;

import java.lang.Math;

/**
 * 
 * Class Description: Class for cone objects
 *
 */
public class Cone extends Shape
{
	/**
	 * 
	Initializes the newly createdCone
	 */
	public Cone()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	Initializes the newly createdCone
	@param height the height of the cone
	@param sideValue the radius of the cone
	 */
	public Cone(double height, double sideValue)
	{
		super(height, sideValue);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculate the volume of the cone
	 */
	@Override
	public double calcVolume()
	{
		Double volume = Math.PI * Math.pow( super.getSideValue() , 2) * super.getHeight();
		return volume;
	}

	/**
	 * Calculate the area of the cone
	 */
	@Override
	public double calcArea()
	{
		Double area = Math.PI * Math.pow( super.getSideValue() , 2);
		return area;
	}
	
	/**
	 * output for print statements for a cone object
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Cone", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}
	
}
