package problemdomain;

/**
 * SquarePrism shape
 * @author Group Auron
 *
 */
public class SquarePrism extends Shape
{
	/**
	 * empty constructor
	 */
	public SquarePrism()
	{
		super();
	}
	/**
	 * constructor with inputs
	 * @param height height of the square prism
	 * @param sideValue side value of the square prism
	 */
	public SquarePrism(double height, double sideValue)
	{
		super(height, sideValue);
	}
	
	/**
	 * Calculating volume for the square prism
	 */
	@Override
	public double calcVolume()
	{
		double volume = Math.pow(super.getSideValue(), 2) * super.getHeight();
		return volume;
	}
	
	/**
	 * Calculating area for the square prism
	 */
	@Override
	public double calcArea()
	{
		double area = Math.pow(super.getSideValue(), 2);
		return area;

		
	}
	
	/**
	 * To string method for sorting display
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Square Base Prism", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}

}
