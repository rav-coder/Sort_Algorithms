package problemdomain;

/**
 * 
 * Class Description: Class for a pentagon base prism object
 *
 */
public class PentagonPrism extends Shape
{
	/**
	 * 
	Initializes the newly createdPentagonPrism
	 */
	public PentagonPrism()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	Initializes the newly createdPentagonPrism
	@param height the height of the prism
	@param sideValue the side of the prism
	 */
	public PentagonPrism(double height, double sideValue)
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
		double volume = calcArea() * super.getHeight();
		return volume;
	}

	/**
	 * Calcualtes the area of the prism
	 */
	@Override
	public double calcArea()
	{
		double area = ((5 * Math.pow(super.getSideValue(), 2) * Math.tan(Math.toRadians(54))) / 4.0);
		return area;
	}
	
	/**
	 * output for print statements for a pentagon base prism object
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Pentagon Base Prism", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}
}
