package problemdomain;

/**
 * 
 * Class Description: Class for a octagon base prism object
 *
 */
public class OctagonPrism extends Shape
{

	/**
	 * 
	Initializes the newly createdOctagonPrism
	 */
	public OctagonPrism()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	Initializes the newly createdOctagonPrism
	@param height the height of the prism
	@param sideValue the side of the prism
	 */
	public OctagonPrism(double height, double sideValue)
	{
		super(height, sideValue);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates the volume of the prism
	 */
	@Override
	public double calcVolume()
	{
		Double volume = calcArea() * super.getHeight();
		return volume;
	}

	/**
	 * Calculates the area of the prism
	 */
	@Override
	public double calcArea()
	{
		double area = 2 * (1 + Math.sqrt(2)) * Math.pow(super.getSideValue(), 2);
		return area;
	}
	
	/**
	 * output for print statements for a octagon base prism object
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Octagon Base Prism", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}

}
