package problemdomain;

/**
 * Pyramids shape
 * @author Group Auron
 *
 */
public class Pyramids extends Shape
{	
	/**
	 * empty constructor
	 */
	public Pyramids()
	{
		super();
	}
	
	/**
	 * constructor with inputs
	 * @param height height height of the Pyramid
	 * @param sideValue side value of the Pyramid
	 */
	public Pyramids(double height, double sideValue)
	{
		super(height, sideValue);
	}
	
	/**
	 * Calculating volume for the Pyramid
	 */
	@Override
	public double calcVolume()
	{
		Double volume = (1.0/3) * Math.PI * Math.pow( super.getSideValue() , 2) * super.getHeight();
		return volume;
	}
	
	/**
	 * Calculating area for the Pyramid
	 */
	@Override
	public double calcArea()
	{
		Double area = Math.pow( super.getSideValue() , 2);
		return area;
	}
	
	/**
	 * To string method for sorting display
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Pyramid", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}
}
