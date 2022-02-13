package problemdomain;

/**
 * 
 * Class Description: Class for cylinder object
 *
 */
public class Cylinder extends Shape
{
	/**
	 * 
	Initializes the newly createdCylinder
	 */
	public Cylinder()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 
	Initializes the newly createdCylinder
	@param height the height of the cylinder
	@param sideValue the radius of the cylinder
	 */
	public Cylinder(double height, double sideValue)
	{
		super(height, sideValue);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Calculates the volume of the cylinder
	 */
	@Override
	public double calcVolume()
	{
		Double volume = (1.0/3) * Math.PI * Math.pow( super.getSideValue() , 2) * super.getHeight();
		return volume;
	}

	/**
	 * Calculates the area of the cylinder
	 */
	@Override
	public double calcArea()
	{
		Double area = Math.PI * Math.pow( super.getSideValue() , 2);
		return area;
	}
	
	/**
	 * output for print statements for a cylinder object
	 */
	@Override
	public String toString() {
		return String.format("%-30s %20.2f %20.2f %20.2f %30.2f \n", 
								"Cylinder", super.getHeight(), super.getSideValue(), calcArea(), calcVolume());
	}

}
