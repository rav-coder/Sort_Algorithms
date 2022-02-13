package problemdomain;

/**
 * 
 * Class Description: class for a equilateral triangle prism object
 *
 */
public class EquilateralTrianglePrism extends Shape
{

	/**
	 * 
	Initializes the newly createdEquilateralTrianglePrism
	 */
	public EquilateralTrianglePrism()
	{
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	Initializes the newly createdEquilateralTrianglePrism
	@param height the height of the prism
	@param sideValue the side of the prism
	 */
	public EquilateralTrianglePrism(double height, double sideValue)
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
		double area = (Math.sqrt(3) * Math.pow(super.getSideValue(), 2)) / 4.0;
		return area;
	}
	
	/**
	 * output for print statements for a equilateral triangle prism object
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Equi-Triangle Base Prism", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}

}
